package com.pcd.ecommerce.service;
import com.pcd.ecommerce.model.Auction;
import java.util.List;

public interface AuctionService {
    Auction createAuction(Auction auction);
    Auction updateAuction(Auction auction);
    Auction getAuctionById(Long id);
    List<Auction> getAllAuction();
    void deleteAuctionById(Long id);

}