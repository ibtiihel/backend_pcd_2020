package com.pcd.ecommerce.service.Impl;
import com.pcd.ecommerce.dao.AuctionRepository;
import com.pcd.ecommerce.model.Auction;
import com.pcd.ecommerce.service.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AuctionServiceImpl implements AuctionService {

    @Autowired
    private AuctionRepository auctionRepository;

    @Override
    public Auction createAuction(Auction auction){return this.auctionRepository.save(auction);}
    @Override
    public  Auction updateAuction(Auction auction){ return this.auctionRepository.save(auction);}
    @Override
    public List<Auction> getAllAuction(){return this.auctionRepository.findAll();}
    @Override
    public Auction getAuctionById(Long id) {return this.auctionRepository.findById(id).get();}
    @Override
    public void deleteAuctionById(Long id) {
        this.auctionRepository.deleteById(id);
    }



}
