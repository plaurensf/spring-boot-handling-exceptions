package laurens.poc.handlingexceptionsspringboot.service.impl;

import laurens.poc.handlingexceptionsspringboot.entities.Product;
import laurens.poc.handlingexceptionsspringboot.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class ProductServiceImpl implements ProductService {

    private List<Product> listProducts;

    @PostConstruct
    private void initialize(){
        this.listProducts = Arrays.asList(
                new Product(1, "Rice", 1000.0, 10),
                new Product(4, "Soap", 500.0, 20),
                new Product(5, "Spaguetti", 800.0, 15),
                new Product(2, "Pillow", 25000.0, 5),
                new Product(8, "Coconut", 900.0, 20)
        );
    }

    @Override
    public List<Product> getAllProducts() throws Exception {
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 10);

        if( randomNumber > 5 )
            throw new Exception("Out of bound");

        return listProducts;
    }

    @Override
    public Product findProductById(Long id) {
        return this.listProducts
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}
