package Day5.Business.abstracts;

import Day5.Entities.concretes.Customer;

public interface RegisterCheckService {
    boolean checkName(Customer customer);
    boolean checkEmail(Customer customer);
    boolean checkPassword(Customer customer);
    boolean check(Customer customer);

}
