package ru.noname.lab2;

import java.lang.reflect.Field;
import ru.ifmo.se.pokemon.Pokemon;
// import ru.ifmo.se.pokemon.Team; // cannot be imported
import java.util.Queue;
import ru.ifmo.se.pokemon.Battle;

class BattleController {

    public static Boolean check(Battle b) throws Exception {
        Field alliesField = Battle.class.getDeclaredField("allies");
        alliesField.setAccessible(true);

        Class teamClassExample = (Class) alliesField.get(b).getClass();
        Object alliesObj = alliesField.get(b);

        Field teamTeamField = teamClassExample.getDeclaredField("team");

        teamTeamField.setAccessible(true);
        @SuppressWarnings("unchecked")
        Queue<Pokemon> allies = (Queue<Pokemon>) teamTeamField.get(alliesObj);

        Field foesField = Battle.class.getDeclaredField("foes");
        foesField.setAccessible(true);

        Class foesTeamClassExample = (Class) foesField.get(b).getClass();
        Object foesObj = foesField.get(b);

        Field foesTeamField = foesTeamClassExample.getDeclaredField("team");

        foesTeamField.setAccessible(true);
        @SuppressWarnings("unchecked")
        Queue<Pokemon> foes = (Queue<Pokemon>) foesTeamField.get(foesObj);

        if (foes.isEmpty()) {
            System.out.println("G-Команда пустовата для начала битвы");
            return false;
        } else if (allies.isEmpty()) {
            System.out.println("T-Команда пустовата для начала битвы");
            return false;
        } else {
            return true;
        }
    }
}