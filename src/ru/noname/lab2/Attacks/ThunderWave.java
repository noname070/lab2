package ru.noname.lab2.Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends PhysicalMove {
    public ThunderWave () {
        super(Type.ELECTRIC, 20, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.paralyze(p);
    }

    @Override
    protected String describe() {
        return "заставляет всех слышать раскат грома";
    }
}
