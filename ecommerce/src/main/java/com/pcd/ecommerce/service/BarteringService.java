package com.pcd.ecommerce.service;
import com.pcd.ecommerce.model.Bartering;
import com.pcd.ecommerce.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface BarteringService {
    Bartering createBartering(Bartering bartering) throws Exception;
    Bartering updateBartering(Bartering bartering);
    Bartering getBarteringById(Long id);
    List<Bartering> getAllBartering();
    void deleteBarteringById(Long id);

    Bartering uploadBartering(long id, MultipartFile image) throws IOException;

    void switchOwners(long user1, long product1, long user2, long product2);
}
