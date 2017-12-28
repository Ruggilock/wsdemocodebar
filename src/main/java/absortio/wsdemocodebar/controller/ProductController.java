package absortio.wsdemocodebar.controller;

import absortio.wsdemocodebar.model.Product;
import absortio.wsdemocodebar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/findcodebar/{codebar}")
    public Collection<Product> getProduct(@PathVariable String codebar) {
        return productService.findByBarCode(codebar);
    }

    @GetMapping("/findallcodebar")
    public Collection<Product> getAllProduct() {
        return productService.findAllProduct();
    }

    @PostMapping("/savecodebar")
    public void createProduct(@RequestBody Product product) {

        productService.save(product);

    }
}
