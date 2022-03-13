public class CustomerManager {

    private Logger logger;

    public CustomerManager(Logger logger) {
        this.logger = logger;
    }

    public void add(Customer customer){
        System.out.println("customer is added : "+customer.getFirstName());
        logger.log(customer.getFirstName()+" is logged");
    }
    
    public void delete(Customer customer){
        System.out.println("customer is deleted : "+customer.getFirstName());

    }
    
}
