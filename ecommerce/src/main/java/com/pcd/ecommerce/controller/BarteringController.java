package com.pcd.ecommerce.controller;
import com.pcd.ecommerce.model.Bartering;
import com.pcd.ecommerce.service.BarteringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/bartering")
public class BarteringController {
    @Autowired
    private BarteringService barteringService;

    @GetMapping("{id}")
    public Bartering getBarteringById(@PathVariable Long id){return this.barteringService.getBarteringById(id);}

    @GetMapping
    public List<Bartering> getAllBartering() {return this.barteringService.getAllBartering();}

    @PostMapping
    public Bartering createBartering( @RequestBody Bartering bartering){ return this.barteringService.createBartering(bartering); }

    @PutMapping
    public  Bartering updateBartering(@RequestBody Bartering bartering){return this.barteringService.updateBartering(bartering);}

    @DeleteMapping("{id}")
    public HttpStatus deleteBarteringById(@PathVariable Long id){
        this.barteringService.deleteBarteringById(id);
         return HttpStatus.OK; }


}
