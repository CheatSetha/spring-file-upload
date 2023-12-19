package com.example.uploadmultiplefile.service;

import com.example.uploadmultiplefile.model.FileDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileService {
    FileDto uploadSingleFile(MultipartFile file);
    List<FileDto> uploadMultipleFiles(List<MultipartFile> files);
}
