package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public class final MagicalLeaf extends SpecialMove {
    public MagicalLeaf() {
        super(Type.GRASS, 60, Double.POSITIVE_INFINITY);
    }

    @Override
    protected String describe() {
        return "использует Magical Leaf";
    }
}
