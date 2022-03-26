package Day5.Business.abstracts;

import Day5.Entities.concretes.Customer;

public interface CustomerService {
    void register(Customer customer);
    void login(Customer customer);
}
