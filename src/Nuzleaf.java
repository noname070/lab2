import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;

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


class Rage extends SpecialMove {
    public Rage () {
        super(Type.NORMAL, 20, 100);        
    }

    @Override
    protected String describe() {
        return "заливает глаза кровью и начинается сущий кошмар";
        
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect eff = new Effect().stat(Stat.ATTACK, (int) p.getStat(Stat.ATTACK) + 1);
        p.addEffect(eff);
    }
}

class HydroPump extends PhysicalMove {
    public HydroPump () {
        super(Type.WATER, 110, 80);
    }
    
    @Override
    protected java.lang.String describe() {
        return "всасывает всю ближайшую подземную воду";
    }
}

class MudSlap extends PhysicalMove {
    public MudSlap () {
        super(Type.GROUND, 20, 100);
    }

    @Override
    protected String describe() {
        return "обмазывает кисти рук грязью и начинает щелкать пальцами";
    }

    protected void applyOppDamage(Pokemon p) {
        Effect eff = new Effect().turns(1).stat(Stat.ACCURACY, -1);
        p.addEffect(eff);
    }
}

