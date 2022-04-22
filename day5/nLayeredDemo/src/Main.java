import Business.abstracts.ProductService;
import Business.concretes.ProductManager;
import Core.JLoggerManagerAdapter;
import DataAccess.concretes.AbcProductDao;
import DataAccess.concretes.HibernateProductDao;
import Entities.concretes.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        Product product = new Product(1,2,12,50,"elma");
        productService.add(product);
    }
}
