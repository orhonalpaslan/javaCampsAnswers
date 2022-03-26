package Day4.Answer2;

import Day4.Answer2.abstracts.BaseCustomerManager;
import Day4.Answer2.concretes.CustomerCheckManager;
import Day4.Answer2.concretes.NeroCustomerManager;
import Day4.Answer2.concretes.StarbucksCustomerManager;
import Day4.Answer2.entities.Customer;

public class Main {
    public static void main(String[] args) {
        /*
        Kahve dükkanları için müşeri yönetimi yapan bir sistem yazmak istiyoruz.
        Starbucks ve Nero firması için çalışıyoruz.
        İki firma da müşterilerini veri tabanına kaydetmek istiyor.
        Starbucks müşeterileri kaydederken, mutlaka mernis doğrulaması istiyor.
        Nero müşterileri kaydederken böyle bir şey
        istemiyor.
        %%% Starbucks müşleriler için kahve alımında yıldız kazandırmak istiyor.%%%%
        */
        BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
        baseCustomerManager.save(new Customer(1,"Orhon","Alpaslan","1994","6969929297894"));
        BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
        baseCustomerManager1.save(new Customer(1,"Ahmet","Yılmaz","1969","969692927894"));


    }
}
