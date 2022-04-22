package Business.abstracts;

import java.util.List;

import Entities.concretes.Product;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
