package Day4.Answer2.concretes;

import Day3.Answer1.inheritance.Customer;
import Day4.Answer2.abstracts.BaseCustomerManager;
import Day4.Answer2.abstracts.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }
        else{
            throw new RuntimeException("Not a valid person!");
        }
    }

}