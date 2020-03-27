package com.pcd.ecommerce.service;
import com.pcd.ecommerce.model.Bartering;
import java.util.List;

public interface BarteringService {
    Bartering createBartering(Bartering bartering);
    Bartering updateBartering(Bartering bartering);
    Bartering getBarteringById(Long id);
    List<Bartering> getAllBartering();
    void deleteBarteringById(Long id);
}
