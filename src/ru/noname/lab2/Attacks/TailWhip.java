package ru.noname.lab2.Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;

public class TailWhip extends PhysicalMove {
    public TailWhip () {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect eff = new Effect().stat(Stat.DEFENSE, -1);
        p.addEffect(eff);
    }

    @Override
    protected String describe() {
        return "хватает оппонента хвостом";
    }
}