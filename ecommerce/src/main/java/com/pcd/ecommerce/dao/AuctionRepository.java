package com.pcd.ecommerce.dao;
import com.pcd.ecommerce.model.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRepository extends JpaRepository<Auction, Long> {
}
