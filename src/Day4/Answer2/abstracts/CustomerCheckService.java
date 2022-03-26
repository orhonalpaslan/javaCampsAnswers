package Day4.Answer2.abstracts;


import Day4.Answer2.entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
