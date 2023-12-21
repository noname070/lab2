package ru.noname.lab2.Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MudSlap extends PhysicalMove {
    public MudSlap () {
        super(Type.GROUND, 20, 100);
    }

    @Override
    protected String describe() {
        return "обмазывает кисти рук грязью и начинает щелкать пальцами";
    }

    protected void applyOppDamage(Pokemon p) {
        Effect eff = new Effect().turns(1).stat(Stat.ACCURACY, -1);
        p.addEffect(eff);
    }
}
