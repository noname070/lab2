package ru.noname.lab2.MyPokemons;

import ru.ifmo.se.pokemon.Pokemon;

import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;

import ru.noname.lab2.Attacks.DoubleKick;
import ru.noname.lab2.Attacks.MetalClaw;
import ru.noname.lab2.Attacks.LeechSeed;
import ru.noname.lab2.Attacks.Disable;

public class Froslass extends Pokemon {
    
    private Move DoubleKick = new DoubleKick();
    private Move MetalClaw = new MetalClaw();
    private Move LeechSeed = new LeechSeed();
    private Move Disable = new Disable();

    public Froslass (String var1, int level) {
        super(var1, level);
        this.setType(Type.ICE, Type.GHOST);
        this.setStats(70, 80, 70, 80, 70,110);
        this.setMove(DoubleKick, MetalClaw, LeechSeed, Disable);

        }
}
