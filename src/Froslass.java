import ru.ifmo.se.pokemon.Pokemon;

import java.util.Arrays;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;

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

class DoubleKick extends PhysicalMove {

    public DoubleKick () {
        super(Type.PSYCHIC, 30, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppDamage(p, 10);
    }

    @Override
    protected String describe() {
        return "разминает шею и прописывает двоечку";
    }

}

class MetalClaw extends PhysicalMove {

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

class LeechSeed extends SpecialMove {

    public LeechSeed () {
        super(Type.GRASS, 0, 90);
        
    }

    @Override
    protected String describe() {
        return "что-то шепчет траве и кидает пиявок";
        
    }

    protected void applyOppEffects(Pokemon p) {
        Type[] ptypes = p.getTypes();
        if (!Arrays.asList(ptypes).contains(Type.GRASS)) {
            Effect.poison(p);
        }        
    }

}

class Disable extends SpecialMove {

    public Disable () {
        super(Type.NORMAL, 0, 55);
        
    }

    @Override
    protected String describe() {
        return "рассыпает снотворное на поле боя S";
        
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect eff = new Effect().turns(8).chance(.5).stat(Stat.ATTACK, -1);
        p.addEffect(eff);
    }
        
}

