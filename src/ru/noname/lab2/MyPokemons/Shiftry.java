package ru.noname.lab2.MyPokemons;

import ru.ifmo.se.pokemon.Pokemon;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Move;

import ru.noname.lab2.Attacks.Rage;
import ru.noname.lab2.Attacks.HydroPump;
import ru.noname.lab2.Attacks.MudSlap;

public class Shiftry extends Pokemon {

    private Move Rage = new Rage();
    private Move HydroPump = new HydroPump();
    private Move MudSlap = new MudSlap();

    public Shiftry (String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.DARK);
        this.setStats(90, 100, 60, 90, 60, 80);
        this.setMove(Rage, HydroPump, MudSlap);
    }

}
