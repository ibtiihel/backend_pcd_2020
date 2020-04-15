package com.pcd.ecommerce.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;
@Data
@Entity
@Table(name="auction")

public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Title;
    private double CurrentPrice;

    private double StartingPrice;

    private String Description;

    private Date PostedDate;

    private Date EndingDate;

    @Column(name="imageAuction")
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] ImageAuction;

    public byte[] getImageAuction() {
        return ImageAuction;
    }

    public void setImageAuction (byte[] ImageAuction) {
        this.ImageAuction = ImageAuction;
    }
}

