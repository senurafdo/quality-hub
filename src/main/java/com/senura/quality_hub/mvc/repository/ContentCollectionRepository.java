package com.senura.quality_hub.mvc.repository;

import com.senura.quality_hub.mvc.model.Content;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findByID(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public boolean existById(Integer id) {
        return contentList.stream().anyMatch(c -> c.id().equals(id));
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }

    @PostConstruct
    private void initData() {
        contentList.add(new Content(
                1,
                "Introduction to Java",
                "Learn the basics of Java programming language.",
                com.senura.quality_hub.mvc.model.Status.PUBLISHED,
                com.senura.quality_hub.mvc.model.Type.ARTICLE,
                java.time.LocalDateTime.now().minusDays(10),
                java.time.LocalDateTime.now().minusDays(5),
                "https://example.com/java-intro"
        ));

        contentList.add(new Content(
                2,
                "Spring Boot Tutorial",
                "A comprehensive guide to building applications with Spring Boot.",
                com.senura.quality_hub.mvc.model.Status.DRAFT,
                com.senura.quality_hub.mvc.model.Type.VIDEO,
                java.time.LocalDateTime.now().minusDays(8),
                java.time.LocalDateTime.now().minusDays(3),
                "https://example.com/spring-boot-tutorial"
        ));
    }
}
