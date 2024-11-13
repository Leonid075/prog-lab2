package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        if (p.getCondition() == Status.PARALYZE || p.getCondition() == Status.POISON) {
            super.applyOppDamage(p, damage*2);
        }
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}
