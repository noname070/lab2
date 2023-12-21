package ru.noname.lab2.Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleKick extends PhysicalMove {

    public DoubleKick () {
        super(Type.PSYCHIC, 30, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppDamage(p, 10);
    }

    @Override
    protected String describe() {
        return "разминает шею и прописывает двоечку";
    }

}