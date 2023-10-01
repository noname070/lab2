package ru.noname.lab2.Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

import java.util.Arrays;


public class LeechSeed extends SpecialMove {

    public LeechSeed () {
        super(Type.GRASS, 0, 90);
        
    }

    @Override
    protected String describe() {
        return "что-то шепчет траве и кидает пиявок";
        
    }

    protected void applyOppEffects(Pokemon p) {
        Type[] ptypes = p.getTypes();
        if (!Arrays.asList(ptypes).contains(Type.GRASS)) {
            Effect.poison(p);
        }        
    }

}