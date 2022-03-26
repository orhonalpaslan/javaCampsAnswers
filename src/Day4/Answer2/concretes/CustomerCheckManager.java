package Day4.Answer2.concretes;

import Day3.Answer1.inheritance.Customer;
import Day4.Answer2.abstracts.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
