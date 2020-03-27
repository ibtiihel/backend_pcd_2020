package com.pcd.ecommerce.controller;

import com.pcd.ecommerce.dao.ImageRepository;
import com.pcd.ecommerce.model.Image;
import com.pcd.ecommerce.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ImageController {

    @Autowired
    private ImageRepository imageRepository;

    @PostMapping("/image")
    public ResponseEntity<Image> saveImage(@RequestParam("myFile") MultipartFile file) throws IOException {
        Image img = new Image( file.getOriginalFilename(),file.getContentType(),file.getBytes() );
        return ResponseEntity.ok().body(this.imageRepository.save(img));
    }

}
