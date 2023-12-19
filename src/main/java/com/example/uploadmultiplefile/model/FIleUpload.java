package com.example.uploadmultiplefile.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@Table(name = "file_upload")
public class FIleUpload {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String extension;
    private String fileName;
    private String fileOrgName;
    private Long fileSize;
    private String fullPath;
    private boolean status;
    private String channelCode;
    private LocalDateTime uploadedDate = LocalDateTime.now();


}
