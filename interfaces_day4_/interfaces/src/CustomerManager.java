public class CustomerManager {

    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer){
        System.out.println("customer is added : "+customer.getFirstName()); 
        Utils.runLoggers(loggers, customer.getFirstName() + " is added.");
    }
    
    public void delete(Customer customer){
        System.out.println("customer is deleted : "+customer.getFirstName());
        Utils.runLoggers(loggers, customer.getFirstName() + " is deleted.");
    }

}
