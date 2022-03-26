package Day3.Answer1.polymorphismDemo;

public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("Müşteri eklendi.");
        this.logger.log("LOG MESSAGE");
    }
}
