package javaCampTasks.Day3.Answer1;

import Day3.Answer1.inheritance.Customer;
import Day3.Answer1.inheritance.Employee;
import Day3.Answer1.inheritance.EmployeeManager;
import Day3.Answer1.inheritanceDemo.KrediUI;
import Day3.Answer1.inheritanceDemo.OgretmenKrediManager;
import Day3.Answer1.inheritanceDemo.TarimKrediManager;
import Day3.Answer1.polymorphismDemo.*;

public class Main {
    public static void main(String[] args) {
        /*
        Aşağıdaki oynatma listesini 27-39 aralığında izleyiniz.(27-39 Dahil)
        Kendiniz de uygulayınız.
        https://www.youtube.com/watch?v=zfIt6x-guc0&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=28
        */
        System.out.println("----------------INHERITANCE---------------------");
        Customer customer = new Customer();
        Employee employee = new Employee();
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.list();
        employeeManager.add();
        employeeManager.bestEmployee();
        System.out.println("----------------INHERITANCE DEMO---------------------");
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new OgretmenKrediManager());
        System.out.println("----------------POLYMORPHISIM DEMO---------------------");
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Email ile loglandı.");
        BaseLogger[] loggers = {new FileLogger(), new EmailLogger(), new DatabaseLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("Log Mesajı ");
        }
        System.out.println("-------------------------------");
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

        System.out.println("----------------POLYMORPHISIM DEMO---------------------");

    }

}
