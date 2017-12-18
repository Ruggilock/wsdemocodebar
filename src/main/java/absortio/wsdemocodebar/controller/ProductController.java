package absortio.wsdemocodebar.controller;

import absortio.wsdemocodebar.model.Product;
import absortio.wsdemocodebar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/findcodebar/{codebar}")
    public Collection<Product> getAllUsuario(@PathVariable String codebar) {
        return productService.findByBarCode(codebar);
    }

}
