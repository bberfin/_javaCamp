package DataAccess.concretes;

import java.util.List;

import DataAccess.abstracts.ProductDao;
import Entities.concretes.Product;

public class HibernateProductDao implements ProductDao{

    @Override
    public void add(Product product) {
        System.out.println(product.getName() + " is added by hibernate");
        
    }

    @Override
    public void update(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Product get(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
