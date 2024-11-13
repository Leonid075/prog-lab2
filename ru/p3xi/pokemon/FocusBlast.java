package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public final class FocusBlast extends SpecialMove  {
    public FocusBlast() {
        super(Type.FIGHTING, 120, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "использует Focus Blast";
    }
}