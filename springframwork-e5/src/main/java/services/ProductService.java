package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repositories.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;

    @Transactional
    public void addOneProduct() {
        productRepo.addProduct("Beer");
    }

}
