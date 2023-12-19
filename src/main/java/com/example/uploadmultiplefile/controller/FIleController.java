package com.example.uploadmultiplefile.controller;

import com.example.uploadmultiplefile.model.FileDto;
import com.example.uploadmultiplefile.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import java.util.List;

@RestController
@RequestMapping("/api/v1/file")
@RequiredArgsConstructor
public class FIleController {

    private final FileService fileService;

    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestPart("file") MultipartFile file){

        FileDto fileDto = fileService.uploadSingleFile(file);
        System.out.println(fileDto);
        return ResponseEntity.ok(fileDto);
    }
    @PostMapping("/upload-multiple")
    public ResponseEntity<?> uploadMultipleFiles(@RequestPart("files") List<MultipartFile> files){
        return ResponseEntity.ok(fileService.uploadMultipleFiles(files));
    }
}
