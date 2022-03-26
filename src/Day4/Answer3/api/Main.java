package Day4.Answer3.api;

import Day4.Answer3.business.abstracts.GamerService;
import Day4.Answer3.business.concretes.GameManager;
import Day4.Answer3.business.concretes.GamerCheckManager;
import Day4.Answer3.business.concretes.GamerManager;
import Day4.Answer3.business.concretes.SalesManager;
import Day4.Answer3.entities.concretes.Campaign;
import Day4.Answer3.entities.concretes.Game;
import Day4.Answer3.entities.concretes.Gamer;

public class Main {
    public static void main(String[] args) {

        /*
        1.     Oyuncuların sisteme kayıt olabileceği, bilgilerini güncelleyebileceği, kayıtlarını silebileceği bir ortamı simule ediniz.
               Müşteri bilgilerinin doğruluğunu e-devlet sistemlerini kullanarak doğrulama yapmak istiyoruz.
               (E-devlet sistemlerinde doğrulama TcNo, Ad, Soyad, DoğumYılı bilgileriyle yapılır. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)
        2.     Oyun satışı yapılabilecek satış ortamını simule ediniz.( Yapılan satışlar oyuncu ile ilişkilendirilmelidir.
               Oyuncunun parametre olarak metotta olmasını kastediyorum.)
        3.     Sisteme yeni kampanya girişi, kampanyanın silinmesi ve güncellenmesi imkanlarını simule ediniz.
        4.     Satışlarda kampanya entegrasyonunu simule ediniz.
        5.     Ödevinizi Github’a yükleyiniz. Github linkinizi paylaşınız.
        */

        Game game1 = new Game(1,"GTA Vice City",15);
        Gamer gamer1 = new Gamer(1,"orhonalpaslan","Orhon","ALPASLAN","15627495867");
        Campaign campaign1 = new Campaign(1,"Nostaljik Oyun İndirimi",20);
        GamerService gamerService = new GamerManager(new GamerCheckManager());
        GameManager gameManager = new GameManager();
        gameManager.newGame(game1);
        gamerService.register(gamer1);
        SalesManager salesManager = new SalesManager();
        salesManager.sell(game1,gamer1,campaign1);
    }
}
