package ru.noname.lab2.Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends PhysicalMove {
    public HydroPump () {
        super(Type.WATER, 110, 80);
    }
    
    @Override
    protected java.lang.String describe() {
        return "всасывает всю ближайшую подземную воду";
    }
}