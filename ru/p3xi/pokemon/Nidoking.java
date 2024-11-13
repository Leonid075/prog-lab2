package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public class Nidoking extends Nidorino {
    public Nidoking() {
        super("Nidoking", 1);
        this.setStats(81, 102, 77, 85, 75, 85);
        this.addType(Type.GROUND);
        this.addMove(new Swagger());
    }
    public Nidoking(String name, int level) {
        super(name, level);
        this.setStats(81, 102, 77, 85, 75, 85);
        this.addType(Type.GROUND);
        this.addMove(new Swagger());
    }
}
