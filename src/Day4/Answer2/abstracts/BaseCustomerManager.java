package Day4.Answer2.abstracts;

import Day3.Answer1.inheritance.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    public void save(Customer customer){
        System.out.println("Saved to Database: "+ customer.getFirstName());
    }
}
