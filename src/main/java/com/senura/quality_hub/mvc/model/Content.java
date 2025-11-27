package com.senura.quality_hub.mvc.model;

import com.senura.quality_hub.mvc.model.Status;
import com.senura.quality_hub.mvc.model.Type;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
