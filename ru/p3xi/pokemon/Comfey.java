package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public final class Comfey extends Pokemon {
    public Comfey() {
        super("Comfey", 1);
        this.setStats(51, 52, 90, 82, 110, 100);
        this.setType(Type.FAIRY);
        this.setMove(new DazzlingGleam(), new Facade(), new MagicalLeaf(), new Confide());
    }
    public Comfey(String name, int level) {
        super(name, level);
        this.setStats(51, 52, 90, 82, 110, 100);
        this.setType(Type.FAIRY);
        this.setMove(new DazzlingGleam(), new Facade(), new MagicalLeaf(), new Confide());
    }
}
