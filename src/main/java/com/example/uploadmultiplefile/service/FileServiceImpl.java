package com.example.uploadmultiplefile.service;

import com.example.uploadmultiplefile.model.FileDto;
import com.example.uploadmultiplefile.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    private  FileUtils fileUtil;

    @Autowired
    public void setFileUtil(FileUtils fileUtil) {
        this.fileUtil = fileUtil;
    }

    @Override
    public FileDto uploadSingleFile(MultipartFile file) {
        System.out.println(file.getOriginalFilename());
        return fileUtil.uploadFile(file);
    }

    @Override
    public List<FileDto> uploadMultipleFiles(List<MultipartFile> files) {
        List<FileDto> fileDtoList = new ArrayList<>();
        for (MultipartFile file : files){
            fileDtoList.add(fileUtil.uploadFile(file));

        }
        return fileDtoList;
    }
}
