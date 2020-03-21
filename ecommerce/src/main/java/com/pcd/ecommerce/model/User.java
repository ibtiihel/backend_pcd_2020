package com.pcd.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String email;
    private String password;
    @Column(name="first_name")
    private String  firstName;
    @Column(name="last_name")
    private String  lastName;
    private String phone;


    @OneToOne
    @JoinColumn(name = "cartId")
    @JsonIgnore
    private Cart cart;


}
