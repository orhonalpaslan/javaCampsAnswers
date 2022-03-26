package Day4.Answer3.business.concretes;

import Day4.Answer3.business.abstracts.GameService;
import Day4.Answer3.entities.concretes.Game;

public class GameManager implements GameService {

    @Override
    public void newGame(Game game) {
        System.out.println(game.getGameName() + " Oyunu eklendi.");
    }

    @Override
    public void updateGame(Game game) {
        System.out.println(game.getGameName() + " Oyunu güncellendi.");
    }

    @Override
    public void deleteGame(Game game) {
        System.out.println(game.getGameName() + " Oyunu silindi.");
    }
}
