package Day4.Answer3.business.abstracts;

import Day4.Answer3.entities.concretes.Gamer;

public interface GamerService {
    void register(Gamer gamer);
    void update(Gamer gamer);
    void delete(Gamer gamer);

}
