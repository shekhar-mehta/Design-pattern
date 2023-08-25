package designpattern.observer;

public class Game {
    private Sun sun;

    public Game(Sun sun) {
        this.sun = sun;
    }

    public void tick() {
        if (sun.isUp()) {
            sun.set();
        } else
            sun.rise();
    }
}
