package laurens.poc.handlingexceptionsspringboot.controller;

import laurens.poc.handlingexceptionsspringboot.entities.Product;
import laurens.poc.handlingexceptionsspringboot.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAll() throws Exception {
        return this.productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id) throws Exception {
        return this.productService.findProductById(id);
    }

}
