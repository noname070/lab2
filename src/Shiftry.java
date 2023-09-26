import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Move;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Stat;

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

class FocusEnergy extends PhysicalMove {
    public FocusEnergy () {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect eff = new Effect().chance(1).turns(1).stat(Stat.ATTACK, 20);
        p.addEffect(eff);
    }

    @Override
    protected String describe() {
        return "ловит гармонию с природой и набирается сил";
    }

}
