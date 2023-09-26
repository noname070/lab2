import ru.ifmo.se.pokemon.Pokemon;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;

public class Solrock extends Pokemon {
    
    private Move ThunderShock = new ThunderShock();
    private Move TailWhip = new TailWhip();
    private Move ThunderWave = new ThunderWave();

    public Solrock (String name, int level) {
        super(name, level);
        this.setType(getTypes());
        this.setStats(90, 95, 85, 55, 65, 70);
        this.setMove(ThunderShock, TailWhip, ThunderWave);
    }

}

class Growl extends SpecialMove {
    public Growl () {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect eff = new Effect().stat(Stat.ATTACK, -1);
        p.addEffect(eff);
    }

    @Override
    protected String describe() {
        return "делает глубокий вдох и начинает рычать";
    }


}
