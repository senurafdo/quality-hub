package com.senura.quality_hub.ddd.presentation;

import com.senura.quality_hub.ddd.application.ContentService;
import com.senura.quality_hub.ddd.domain.Content;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contents")
public class ContentController {

    // private final ContentCollectionRepository repository;
    private final ContentService contentService;

    @Autowired
    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping("")
    public List<Content> getAllContents() {
        return contentService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Content> getContentById(@PathVariable Integer id) {
        return contentService.findByID(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public void createContent(@Valid @RequestBody Content content) {
        contentService.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Content content, @PathVariable Integer id) {
        if (!contentService.existById(id))
            throw new RuntimeException("Content not found with id: " + id);
        contentService.save(content);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        contentService.delete(id);
    }

}


