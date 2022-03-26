package Day4.Answer1.Interfaces;

public class OracleCustomerDal implements ICustomerDal,IRepository {
    @Override
    public void add() {
        System.out.println("Müşteri eklendi: ORACLE");
    }

}
