package Day4.Answer3.business.abstracts;

import Day4.Answer3.entities.concretes.Game;

public interface GameService {
    void newGame(Game game);
    void updateGame(Game game);
    void deleteGame(Game game);
}
