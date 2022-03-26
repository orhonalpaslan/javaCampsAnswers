package Day4.Answer3.business.concretes;

import Day4.Answer3.business.abstracts.GamerCheckService;
import Day4.Answer3.entities.concretes.Gamer;

public class GamerCheckManager implements GamerCheckService {
    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
        return true;
    }
}
