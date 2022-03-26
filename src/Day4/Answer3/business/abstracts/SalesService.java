package Day4.Answer3.business.abstracts;

import Day4.Answer3.entities.concretes.Campaign;
import Day4.Answer3.entities.concretes.Game;
import Day4.Answer3.entities.concretes.Gamer;

public interface SalesService {
    void sell(Game game, Gamer gamer, Campaign campaign);
}
