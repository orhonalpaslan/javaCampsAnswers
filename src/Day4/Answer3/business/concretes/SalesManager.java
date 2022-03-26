package Day4.Answer3.business.concretes;

import Day4.Answer3.business.abstracts.SalesService;
import Day4.Answer3.entities.concretes.Campaign;
import Day4.Answer3.entities.concretes.Game;
import Day4.Answer3.entities.concretes.Gamer;

public class SalesManager implements SalesService {
    @Override
    public void sell(Game game, Gamer gamer, Campaign campaign) {
        System.out.println(game.getGameName() +" oyunu "+ gamer.getUsername() + " kullanıcı adlı üyeye "+ campaign.getCampaignName()+ " kampanyası ile satıldı.");
    }
}
