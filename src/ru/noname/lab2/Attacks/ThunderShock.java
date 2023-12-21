package ru.noname.lab2.Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.SpecialMove;


public class ThunderShock extends SpecialMove {
    public ThunderShock () {
        super(Type.ELECTRIC, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Math.random() < .1) { Effect.paralyze(p);}
    }

    @Override
    protected String describe() {
        return "призывает разряд молний";
    }
}