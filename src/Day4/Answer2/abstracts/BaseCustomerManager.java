package Day4.Answer2.abstracts;


import Day4.Answer2.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    public void save(Customer customer){
        System.out.println("Saved to Database: "+ customer.getFirstName());
    }
}
