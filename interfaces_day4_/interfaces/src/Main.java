public class Main {
    public static void main(String[] args) throws Exception {

        Logger databaseLogger = new DatabaseLogger();
        Logger fileLogger = new FileLogger();
        Logger smsLogger = new SmsLogger();
   
        CustomerManager  customerManager = new CustomerManager(databaseLogger);

        Customer customer = new Customer(1, "berfin", "açıkgöz");

        customerManager.add(customer);

    }
}
