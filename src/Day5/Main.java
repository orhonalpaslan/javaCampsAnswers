package Day5;

import Day5.Business.concretes.CustomerManager;
import Day5.Business.concretes.RegisterCheckManager;
import Day5.Business.concretes.VerificationManager;
import Day5.DataAccess.concretes.HibernateCustomerDao;
import Day5.Entities.concretes.Customer;

public class Main {

    // e-ticaret sisteminde sisteme kayıt&sisteme giriş için gerekli nitelik
    // ve kabul şartlarını tamamladım. Bu sisteme ait Java backend yazılacak.

    /*
    Kullanıcılar sisteme bilgilerini girerek üye olabilmelidir.

    Sisteme temel kullanıcı bilgileri , e-posta ve parolayla üye olunabilmelidir.
    Temel kullanıcı bilgileri : ad, soyad, e-posta, parola. Temel bilgilerin tamamı zorunludur.
    Parola en az 6 karakterden oluşmalıdır.
    E-posta alanı e-posta formatında olmalıdır. (Regex ile yapınız. Araştırma konusu)
    E-Posta daha önce kullanılmamış olmalıdır.
    Ad ve soyad en az iki karakterden oluşmalıdır.
    Üyelik sonucu kullanıcıya doğrulama e-postası gönderilmelidir. (Simulasyon)
    Doğrulama linki tıklandığında üyelik tamamlanmalıdır. (Simulasyon)
    Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.
    Kullanıcılar sisteme Google hesapları ile üye olabilmelidir. (Simulasyon)

    İlerleyen zamanlarda başka yetkilendirme servisleri de kullanılabilir. (Sistemi dış servis entegrasyonu olacak şekilde yapılandırınız.)
    Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.
    Kullanıcılar e-posta ve parola bilgisiyle sisteme giriş yapabilmelidir.

    E-posta ve parola zorunludur
    Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.
    */

    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "alpaslanorhon@gmail.com","6969457842","Orhon","Alpaslan");
        CustomerManager customerManager = new CustomerManager(new RegisterCheckManager(), new VerificationManager(), new HibernateCustomerDao());
        customerManager.register(customer1);


    }
}
