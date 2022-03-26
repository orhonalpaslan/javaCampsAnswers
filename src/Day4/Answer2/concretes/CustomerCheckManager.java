package Day4.Answer2.concretes;

import Day4.Answer2.abstracts.CustomerCheckService;
import Day4.Answer2.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
