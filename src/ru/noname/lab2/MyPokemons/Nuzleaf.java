package ru.noname.lab2.MyPokemons;

import ru.ifmo.se.pokemon.Pokemon;

import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;

import ru.noname.lab2.Attacks.Rage;
import ru.noname.lab2.Attacks.HydroPump;
import ru.noname.lab2.Attacks.MudSlap;

public class Nuzleaf extends Pokemon {
    
    private Move Rage = new Rage();
    private Move HydroPump = new HydroPump();
    private Move MudSlap = new MudSlap();

    public Nuzleaf (String var1, int level) {
        super(var1, level);
        this.setMove(Rage, HydroPump, MudSlap);
        this.setType(Type.GRASS, Type.DARK);
        this.setStats(70, 70, 40, 60, 40, 60);

    }
}

