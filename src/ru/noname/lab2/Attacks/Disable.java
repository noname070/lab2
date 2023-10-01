package ru.noname.lab2.Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;


public class Disable extends SpecialMove {

    public Disable () {
        super(Type.NORMAL, 0, 55);
        
    }

    @Override
    protected String describe() {
        return "рассыпает снотворное на поле боя S";
        
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect eff = new Effect().turns(8).chance(.5).stat(Stat.ATTACK, -1);
        p.addEffect(eff);
    }
        
}
