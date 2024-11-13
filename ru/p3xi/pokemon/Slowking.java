package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public class Slowking extends Slowpoke {
    public Slowking() {
        super("Slowking", 1);
        this.setStats(95, 75, 80, 100, 110, 30);
        this.addMove(new FocusBlast());
    }
    public Slowking(String name, int level) {
        super(name, level);
        this.setStats(95, 75, 80, 100, 110, 30);
        this.addMove(new FocusBlast());
    }
}
