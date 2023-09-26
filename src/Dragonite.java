import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dragonite extends Pokemon{

    private Move Rage = new Rage();
    private Move HydroPump = new HydroPump();

    public Dragonite (String name, int level) {
        super(name, level);
        this.setType(Type.DRAGON, Type.FLYING);
        this.setStats(91, 134, 95, 100, 100, 80);
        this.setMove(Rage, HydroPump);
    }
}
