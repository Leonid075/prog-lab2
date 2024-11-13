package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public class Nidorino extends NidoranM {
    public Nidorino() {
        super("Nidorino", 1);
        this.setStats(61, 72, 57, 55, 55, 65);
        this.addMove(new HornAttack());
    }
    public Nidorino(String name, int level) {
        super(name, level);
        this.setStats(61, 72, 57, 55, 55, 65);
        this.addMove(new HornAttack());
    }
}
