package ru.noname.lab2.Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Growl extends SpecialMove {
    public Growl () {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect eff = new Effect().stat(Stat.ATTACK, -1);
        p.addEffect(eff);
    }

    @Override
    protected String describe() {
        return "делает глубокий вдох и начинает рычать";
    }


}
