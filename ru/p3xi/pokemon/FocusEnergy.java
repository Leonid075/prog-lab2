package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public final class FocusEnergy extends StatusMove {
    public FocusEnergy() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, 1);
    }

    @Override
    protected String describe() {
        return "использует Focus Energy";
    }
}