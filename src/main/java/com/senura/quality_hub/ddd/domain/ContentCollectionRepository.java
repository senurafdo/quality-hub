package com.senura.quality_hub.ddd.domain;

import java.util.List;
import java.util.Optional;

public interface ContentCollectionRepository {

    List<Content> findAll();

    Optional<Content> findById(Integer id);

    void save(Content content);

    boolean existsById(Integer id);

    void deleteById(Integer id);
}



