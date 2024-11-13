package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public class Confusion extends StatusMove {
    public Confusion() {
        super(Type.PSYCHIC, 50, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            Effect.confuse(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Confusion";
    }
}
