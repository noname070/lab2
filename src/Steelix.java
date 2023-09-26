import ru.ifmo.se.pokemon.Pokemon;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;


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

class ThunderShock extends SpecialMove {
    public ThunderShock () {
        super(Type.ELECTRIC, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Math.random() < .1) { Effect.paralyze(p);}
    }

    @Override
    protected String describe() {
        return "призывает разряд молний";
    }
}

class TailWhip extends PhysicalMove {
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

class ThunderWave extends PhysicalMove {
    public ThunderWave () {
        super(Type.ELECTRIC, 20, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.paralyze(p);
    }

    @Override
    protected String describe() {
        return "заставляет всех слышать раскат грома";
    }
}
