package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public final class DreamEater extends SpecialMove {
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        if (p.getCondition() == Status.SLEEP) {
            super.applyOppDamage(p, damage);
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, -2);
    }

    @Override
    protected String describe() {
        return "использует Dream Eater";
    }
}