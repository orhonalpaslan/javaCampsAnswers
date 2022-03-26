package Day4.Answer1.Interfaces;

public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("Müşteri eklendi: MYSQL");
    }

}
