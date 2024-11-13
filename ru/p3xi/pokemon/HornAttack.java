package ru.p3xi.pokemon;
import ru.ifmo.se.pokemon.*;

public final class HornAttack extends PhysicalMove{
    public HornAttack() {
        super(Type.NORMAL, 65, 100);
    }

    @Override
    protected String describe() {
        return "использует Horn Attack";
    }
}