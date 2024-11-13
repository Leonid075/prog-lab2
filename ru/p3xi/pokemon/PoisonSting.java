package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public final class PoisonSting extends PhysicalMove{
    public PoisonSting() {
        super(Type.POISON, 15, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if(p.hasType(Type.POISON) || p.hasType(Type.STEEL)) return;
        if (Math.random() < 0.3) {
            Effect.poison(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Poison Sting";
    }
}