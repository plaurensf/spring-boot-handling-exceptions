package laurens.poc.handlingexceptionsspringboot.service;

import laurens.poc.handlingexceptionsspringboot.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts() throws Exception;
    Product findProductById(Long id);

}
