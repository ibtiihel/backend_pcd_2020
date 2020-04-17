package com.pcd.ecommerce.model;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;


@Data
@Entity
@Table(name="bartering")
public class Bartering {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Title;
    private String Description;

    @Lob
    private byte[] barteringImage;

    @ManyToOne(optional = false)
    @JoinColumn(name ="source_user")
    private User sourceUser;


    @ManyToOne(optional = false)
    @JoinColumn(name ="destination_user")
    private User destinationUser;


    @ManyToOne(optional = false)
    @JoinColumn(name ="source_product")
    private Product sourceProduct;

    @ManyToOne(optional = false)
    @JoinColumn(name ="destination_product")
    private Product destinationProduct;
}
