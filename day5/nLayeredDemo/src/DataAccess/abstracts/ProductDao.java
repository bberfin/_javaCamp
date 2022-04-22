package DataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import Entities.concretes.Product;

public interface ProductDao {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product get(int id);  // searching one product
    List<Product> getAll();
}
