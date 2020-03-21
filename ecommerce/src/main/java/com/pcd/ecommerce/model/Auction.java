package com.pcd.ecommerce.model;

import lombok.Data;

import java.time.LocalDateTime;

import javax.persistence.*;
@Data
@Entity
@Table(name="auction")

public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double CurrentPrice;

    private double StartingPrice;

    private String Description;

    private LocalDateTime  PostedDate;

    private LocalDateTime EndingDate;

   /* private User Seller;

    private User Buyer;

    public long getAuctionId(){ return id;}
    public void setAuctionId(long id){this.id=id;}*/


}

