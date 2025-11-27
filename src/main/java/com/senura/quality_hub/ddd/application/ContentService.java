package com.senura.quality_hub.ddd.application;


import com.senura.quality_hub.ddd.domain.Content;
import com.senura.quality_hub.ddd.domain.ContentCollectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContentService {

    private ContentCollectionRepository repository;

    public ContentService(ContentCollectionRepository repository) {
        this.repository = repository;
    }

    public List<Content> findAll() {
        return repository.findAll();
    }

    public Optional<Content> findByID(Integer id) {
        return repository.findById(id);
    }

    public void save(Content content) {
        repository.save(content);
    }

    public boolean existById(Integer id) {
        return repository.existsById(id);
    }

    public void delete(Integer id) {
        repository.deleteById(id);

    }
}
