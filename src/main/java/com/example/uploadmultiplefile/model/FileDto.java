package com.example.uploadmultiplefile.model;

import lombok.Builder;

@Builder
public record FileDto(
        String name,
        String url,
        String extension,
        String downloadUrl,
        long size) {
}
