package Day4.Answer2;

import Day4.Answer2.abstracts.BaseCustomerManager;
import Day4.Answer2.concretes.CustomerCheckManager;
import Day4.Answer2.concretes.NeroCustomerManager;
import Day4.Answer2.concretes.StarbucksCustomerManager;
import Day4.Answer2.entities.Customer;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
        baseCustomerManager.save(new Customer(1,"Orhon","Alpaslan","1994","6969929297894"));
        BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
        baseCustomerManager1.save(new Customer(1,"Ahmet","Yılmaz","1969","969692927894"));



    }
}
