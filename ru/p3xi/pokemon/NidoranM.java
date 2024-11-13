package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public class NidoranM extends Pokemon {
    public NidoranM() {
        super("NidoranM", 1);
        this.setStats(46, 57, 40, 40, 40, 50);
        this.setType(Type.POISON);
        this.setMove(new PoisonSting(), new FocusEnergy());
    }
    public NidoranM(String name, int level) {
        super(name, level);
        this.setStats(46, 57, 40, 40, 40, 50);
        this.setType(Type.POISON);
        this.setMove(new PoisonSting(), new FocusEnergy());
    }
}
