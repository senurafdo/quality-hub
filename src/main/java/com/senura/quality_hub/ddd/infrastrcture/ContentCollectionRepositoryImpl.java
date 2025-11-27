package com.senura.quality_hub.ddd.infrastrcture;

import com.senura.quality_hub.ddd.domain.Content;
import com.senura.quality_hub.ddd.domain.ContentCollectionRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Repository
public class ContentCollectionRepositoryImpl implements ContentCollectionRepository {

    private final List<Content> contentList;

    public ContentCollectionRepositoryImpl(List<Content> contentList) {
        this.contentList = contentList;
    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(
                c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public boolean existsById(Integer id) {
        return contentList.stream().anyMatch(c -> c.id().equals(id));
    }

    public void deleteById(Integer id) {
        Content content = contentList.stream()
                .filter(c -> c.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Content not found with id: " + id));
        contentList.remove(content);
    }


    @PostConstruct
    private void initData() {
        contentList.add(new Content(
                1,
                "Introduction to Java",
                "Learn the basics of Java programming language.",
                com.senura.quality_hub.ddd.domain.Status.PUBLISHED,
                com.senura.quality_hub.ddd.domain.Type.ARTICLE,
                java.time.LocalDateTime.now().minusDays(10),
                java.time.LocalDateTime.now().minusDays(5),
                "https://example.com/java-intro"
        ));

        contentList.add(new Content(
                2,
                "Spring Boot Tutorial",
                "A comprehensive guide to building applications with Spring Boot.",
                com.senura.quality_hub.ddd.domain.Status.DRAFT,
                com.senura.quality_hub.ddd.domain.Type.VIDEO,
                java.time.LocalDateTime.now().minusDays(8),
                java.time.LocalDateTime.now().minusDays(3),
                "https://example.com/spring-boot-tutorial"
        ));
    }
}
