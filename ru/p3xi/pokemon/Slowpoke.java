package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public class Slowpoke extends Pokemon {
    public Slowpoke() {
        super("Slowpoke", 1);
        this.setStats(90, 65, 65, 40, 40, 15);
        this.setType(Type.WATER, Type.PSYCHIC);
        this.setMove(new Confusion(), new Bulldoze(), new DreamEater());
    }
    public Slowpoke(String name, int level) {
        super(name, level);
        this.setStats(90, 65, 65, 40, 40, 15);
        this.setType(Type.WATER, Type.PSYCHIC);
        this.setMove(new Confusion(), new Bulldoze(), new DreamEater());
    }
}
