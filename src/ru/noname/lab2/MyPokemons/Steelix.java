package ru.noname.lab2.MyPokemons;

import ru.ifmo.se.pokemon.Pokemon;

import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;

import ru.noname.lab2.Attacks.ThunderWave;
import ru.noname.lab2.Attacks.TailWhip;
import ru.noname.lab2.Attacks.ThunderShock;


public class Steelix extends Pokemon {
    
    private Move ThunderShock = new ThunderShock();
    private Move TailWhip = new TailWhip();
    private Move ThunderWave = new ThunderWave();

    public Steelix (String name, int level) {
        super(name, level);
        this.setType(Type.STEEL, Type.GROUND);
        this.setStats(75, 85, 200, 55, 65, 30);
        this.setMove(ThunderShock, ThunderWave, TailWhip);
    }

}
