public class Main {
    public static void main(String[] args) throws Exception {


        
        Logger[] loggers = { new DatabaseLogger(),new SmsLogger(), new FileLogger()};

        CustomerManager  customerManager = new CustomerManager(loggers);

        Customer customer = new Customer(1, "berfin", "açıkgöz");

        customerManager.add(customer);

    }
}
