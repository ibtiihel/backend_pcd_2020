package com.pcd.ecommerce.service.Impl;
import com.pcd.ecommerce.model.Bartering;
import com.pcd.ecommerce.service.BarteringService;
import com.pcd.ecommerce.dao.BarteringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarteringServiceImpl implements BarteringService {

    @Autowired
    private BarteringRepository barteringRepository;

    @Override
    public Bartering createBartering(Bartering bartering){ return this.barteringRepository.save(bartering); }

    @Override
    public Bartering updateBartering(Bartering bartering){return this.barteringRepository.save(bartering);}

    @Override
    public Bartering getBarteringById(Long id){return this.barteringRepository.findById(id).get();}

    @Override
    public  List<Bartering> getAllBartering(){return this.barteringRepository.findAll();}

    @Override
    public void deleteBarteringById(Long id){this.barteringRepository.deleteById(id);}




}
