package Day4.Answer3.business.concretes;

import Day4.Answer3.business.abstracts.GamerCheckService;
import Day4.Answer3.business.abstracts.GamerService;
import Day4.Answer3.entities.concretes.Gamer;

public class GamerManager implements GamerService {
    private GamerCheckService gamerCheckService;

    public GamerManager(GamerCheckService gamerCheckService) {
        this.gamerCheckService = gamerCheckService;
    }

    @Override
    public void register(Gamer gamer) {
        if (gamerCheckService.checkIfRealPerson(gamer)) {
            System.out.println("Oyuncu Eklendi: " + gamer.getUsername());
        } else {
            System.out.println("Lütfen bilgilerinizi doğru giriniz.");
        }

    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Oyuncu Güncellendi: " + gamer.getUsername());

    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Oyuncu Silindi: " + gamer.getUsername());

    }
}
