package inheritance;
public class App {
    public static void main(String[] args) throws Exception {
    
        CustomerManager customerManager = new CustomerManager();

        IndividualCustomer individualCustomer = new IndividualCustomer();
        CorporateCustomer corporateCustomer = new CorporateCustomer();

        individualCustomer.customerNumber = "11111";
        corporateCustomer.customerNumber =  "22222";

        Customer[] customers ={corporateCustomer, individualCustomer};
        customerManager.addMultiple(customers);

    }
}
