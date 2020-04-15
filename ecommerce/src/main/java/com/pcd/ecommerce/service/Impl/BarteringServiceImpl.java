package com.pcd.ecommerce.service.Impl;
import com.pcd.ecommerce.model.Bartering;
import com.pcd.ecommerce.model.Product;
import com.pcd.ecommerce.service.BarteringService;
import com.pcd.ecommerce.dao.BarteringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

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

    @Override
    public void uploadImageBartering(long id, MultipartFile image) throws IOException
    {
        Optional<Bartering> barteringDb = barteringRepository.findById(id);
        if (barteringDb.isPresent()){
            Bartering newBartering = barteringDb.get();
            newBartering.setImageBartering(image.getBytes());
            barteringRepository.save(newBartering);
        }

    }




}
