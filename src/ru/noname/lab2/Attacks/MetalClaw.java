package ru.noname.lab2.Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class MetalClaw extends PhysicalMove {

    public MetalClaw () {
        super(Type.STEEL, 50, 95);
    }

    @Override
    protected String describe() {
        return "расчехляет стальные когти";
        
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() < .1) {
            super.applySelfEffects(p);
            Effect eff = new Effect().stat(Stat.ATTACK, 1);
            p.addEffect(eff);
        }
    }

}