package com.pcd.ecommerce.service.Impl;
import com.pcd.ecommerce.model.Bartering;
import com.pcd.ecommerce.service.BarteringService;
import com.pcd.ecommerce.dao.BarteringRepository;
import com.pcd.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarteringServiceImpl implements BarteringService {

    @Autowired
    private BarteringRepository barteringRepository;

    @Autowired
    private ProductService productService;

    @Override
    public Bartering createBartering(Bartering bartering) throws  Exception{
        try{
            Bartering bart = this.barteringRepository.save(bartering);
            switchOwners(bart.getSourceUser().getId(),bart.getSourceProduct().getId(),bart.getDestinationUser().getId(),bart.getDestinationProduct().getId());
            return bart ;
        } catch (Exception e){
            throw e ;
        }


    }

    @Override
    public Bartering updateBartering(Bartering bartering){return this.barteringRepository.save(bartering);}

    @Override
    public Bartering getBarteringById(Long id){return this.barteringRepository.findById(id).get();}

    @Override
    public  List<Bartering> getAllBartering(){return this.barteringRepository.findAll();}

    @Override
    public void deleteBarteringById(Long id){this.barteringRepository.deleteById(id);}

    @Override
    public void switchOwners(long user1, long product1, long user2, long product2){

        this.productService.setOwner(user1,product2);
        this.productService.setOwner(user2,product1);

    }



}
