package com.pcd.ecommerce.service;
import com.pcd.ecommerce.model.Bartering;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface BarteringService {
    Bartering createBartering(Bartering bartering);
    Bartering updateBartering(Bartering bartering);
    Bartering getBarteringById(Long id);
    List<Bartering> getAllBartering();
    void deleteBarteringById(Long id);

    void uploadImageBartering(long id, MultipartFile image) throws IOException;
}
