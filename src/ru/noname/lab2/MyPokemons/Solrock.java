package ru.noname.lab2.MyPokemons;

import ru.ifmo.se.pokemon.Pokemon;

import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;

import ru.noname.lab2.Attacks.ThunderShock;
import ru.noname.lab2.Attacks.TailWhip;
import ru.noname.lab2.Attacks.ThunderWave;

public class Solrock extends Pokemon {
    
    private Move ThunderShock = new ThunderShock();
    private Move TailWhip = new TailWhip();
    private Move ThunderWave = new ThunderWave();

    public Solrock (String name, int level) {
        super(name, level);
        this.setType(Type.ROCK, Type.PSYCHIC);
        this.setStats(90, 95, 85, 55, 65, 70);
        this.setMove(ThunderShock, TailWhip, ThunderWave);
    }

}
