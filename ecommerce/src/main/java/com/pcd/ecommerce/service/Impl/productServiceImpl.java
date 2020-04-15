package com.pcd.ecommerce.service.Impl;

import com.pcd.ecommerce.model.Product;
import com.pcd.ecommerce.dao.ProductRepository;
import com.pcd.ecommerce.exceptions.ResourceNotFoundException;
import com.pcd.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class productServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product){
        Optional< Product > productDb = this.productRepository.findById(product.getId());

        if(productDb.isPresent()){
            Product productUpdate = productDb.get();
            productUpdate.setId(product.getId());
            productUpdate.setName(product.getName());
            productUpdate.setDescription((product.getDescription()));
            productRepository.save(productUpdate);

            return productUpdate;
        }
        else{
            throw new ResourceNotFoundException("Record not found iwth id: " + product.getId());
        }
    }
    @Override
    public List< Product > getAllProduct() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getProductById(long productId) {

        Optional < Product > productDb = this.productRepository.findById(productId);

        if (productDb.isPresent()) {
            return productDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + productId);
        }
    }

    @Override
    public void deleteProduct(long productId) {
        Optional < Product > productDb = this.productRepository.findById(productId);

        if (productDb.isPresent()) {
            this.productRepository.delete(productDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + productId);
        }

    }

    @Override
    public void uploadImage(long id, MultipartFile image) throws IOException
    {
        Optional<Product> productDb = productRepository.findById(id);
        if (productDb.isPresent()){
            Product newProduct = productDb.get();
            newProduct.setImageProduct(image.getBytes());
            productRepository.save(newProduct);
        }

    }

}
