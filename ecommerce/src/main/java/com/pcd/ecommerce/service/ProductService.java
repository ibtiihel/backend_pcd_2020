package com.pcd.ecommerce.service;


import com.pcd.ecommerce.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    Product updateProduct(Product product);

    List<Product > getAllProduct();

    Product getProductById(long productId);

    void deleteProduct(long id);

    void uploadImage(long id, MultipartFile image) throws IOException;

}
