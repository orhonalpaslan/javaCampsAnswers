package Day5.DataAccess.abstracts;

import Day5.Entities.concretes.Customer;

import java.util.List;

public interface CustomerDao {
    void add(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
    List<Customer> getAll();
}


