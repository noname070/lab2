package ru.noname.lab2;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;

import ru.noname.lab2.MyPokemons.*;

public class App {
    public static void main(String[] args) throws Exception {
        Battle b = new Battle();
        Pokemon T1 = new Froslass("ЛЕВИН", 50);
        Pokemon T2 = new Nuzleaf("ПРАВИН", 50);
        Pokemon T3 = new Solrock("ПРЯМИН", 50);

        Pokemon G1 = new Steelix("ПЕЧЕНЬ", 50);
        Pokemon G2 = new Dragonite("СЕРДЦЕ", 50);
        Pokemon G3 = new Shiftry("ПОЧКИ", 50);

        b.addAlly(T1);
        b.addAlly(T2);
        b.addAlly(T3);

        b.addFoe(G1);
        b.addFoe(G2);
        b.addFoe(G3);

        b.go();
    }
}
