package com.pcd.ecommerce.service;
import com.pcd.ecommerce.model.Auction;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface AuctionService {
    Auction createAuction(Auction auction);
    Auction updateAuction(Auction auction);
    Auction getAuctionById(Long id);
    List<Auction> getAllAuction();
    void deleteAuctionById(Long id);
    void uploadImageAuction(long id, MultipartFile image) throws IOException;




}