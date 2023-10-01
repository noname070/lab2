package ru.noname.lab2.Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Rage extends SpecialMove {
    public Rage () {
        super(Type.NORMAL, 20, 100);        
    }

    @Override
    protected String describe() {
        return "заливает глаза кровью и начинается сущий кошмар";
        
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect eff = new Effect().stat(Stat.ATTACK, (int) p.getStat(Stat.ATTACK) + 1);
        p.addEffect(eff);
    }
}
