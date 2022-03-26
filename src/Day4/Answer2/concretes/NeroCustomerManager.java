package Day4.Answer2.concretes;

import Day3.Answer1.inheritance.Customer;
import Day4.Answer2.abstracts.BaseCustomerManager;

public class NeroCustomerManager extends BaseCustomerManager {
    @Override
    public void save(Customer customer) {
        super.save(customer);
    }

    @Override
    public void save(Day4.Answer2.entities.Customer customer) {

    }
}
