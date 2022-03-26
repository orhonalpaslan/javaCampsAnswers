package Day4.Answer1.AbstractClasses;

public abstract class BaseGameCalculator {
    public abstract void hesapla();
    public final void gameOver(){
        System.out.println("Game over.");
    }
}
