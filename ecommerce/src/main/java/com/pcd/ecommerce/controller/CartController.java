package com.pcd.ecommerce.controller;

import com.pcd.ecommerce.model.Cart;
import com.pcd.ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cart")
@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Cart> getAllCarts(){
        return this.cartService.getAllCarts();
    }
    @GetMapping("{id}")
    public Cart getCartById(@PathVariable Long id){
        return  this.cartService.getCartById(id);
    }

    @PostMapping
    public Cart createCart(@RequestBody Cart cart){
        return this.cartService.createCart(cart);
    }

    @PutMapping
    public Cart updateCart(@RequestBody Cart cart){
        return this.cartService.updateCart(cart);
    }

    @DeleteMapping("{id}")
    public HttpStatus deleteCart(@PathVariable Long id){
        this.cartService.deleteById(id);
        return HttpStatus.OK;
    }
}
