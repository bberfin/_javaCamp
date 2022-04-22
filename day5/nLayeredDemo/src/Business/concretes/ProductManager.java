package Business.concretes;

import java.util.List;

import Business.abstracts.ProductService;
import Core.LoggerService;
import DataAccess.abstracts.ProductDao;
import Entities.concretes.Product;

public class ProductManager implements ProductService {

    private  ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId()==1){
            System.out.println("the product which is in this category is not accepted.");
            return;
        }
        
        this.productDao.add(product);
        this.loggerService.logToSystem(product.getName()+" is added");
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
