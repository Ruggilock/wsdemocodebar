package absortio.wsdemocodebar.service;

import absortio.wsdemocodebar.model.Product;
import absortio.wsdemocodebar.repository.ProductRepository;
import javafx.stage.DirectoryChooser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public void delete(Integer id) {
        productRepository.delete(id);
    }

    public void save(Product productModel) {
        productRepository.save(productModel);
    }

    public Collection<Product> findByBarCode(String barCode){
        return productRepository.findByBarCode(barCode);
    }

}
