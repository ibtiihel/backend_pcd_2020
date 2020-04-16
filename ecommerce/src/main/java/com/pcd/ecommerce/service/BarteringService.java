package com.pcd.ecommerce.service;
import com.pcd.ecommerce.model.Bartering;
import java.util.List;

public interface BarteringService {
    Bartering createBartering(Bartering bartering) throws Exception;
    Bartering updateBartering(Bartering bartering);
    Bartering getBarteringById(Long id);
    List<Bartering> getAllBartering();
    void deleteBarteringById(Long id);

    void switchOwners(long user1, long product1, long user2, long product2);
}
