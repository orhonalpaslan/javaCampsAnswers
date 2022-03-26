package Day4.Answer3.entities.concretes;

import Day4.Answer3.entities.abstracks.Entity;

public class Game extends Entity {
    private String gameName;
    private double price;

    public Game() {
    }

    public Game(int id, String gameName, double price) {
        super(id);
        this.gameName = gameName;
        this.price = price;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
