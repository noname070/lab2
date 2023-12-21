package ru.noname.lab2;

import java.lang.reflect.Field;
import ru.ifmo.se.pokemon.Pokemon;
// import ru.ifmo.se.pokemon.Team; // cannot be imported
import java.util.Queue;
import ru.ifmo.se.pokemon.Battle;

class BattleController { 
    public static void main () throws Exception {
        
    }
    public static Boolean check (Battle b) throws Exception {
        Field alliesField = Battle.class.getDeclaredField("allies");
        alliesField.setAccessible(true);
        
        Class teamClassExample = (Class) alliesField.get(b).getClass();
        // -> class ru.ifmo.se.pokemon.Team
        Object alliesObj = alliesField.get(b);
        
        Field teamTeamField = teamClassExample.getDeclaredField("team");
        // Queoe<Pokemon> team
  
        teamTeamField.setAccessible(true);
        Queue<Pokemon> allies = (Queue<Pokemon>) teamTeamField.get(alliesObj);
        // -> [p1, p... Pokemons in team]


        Field foesField = Battle.class.getDeclaredField("foes");
        foesField.setAccessible(true);
        
        Class foesTeamClassExample = (Class) foesField.get(b).getClass();
        // -> сlass ru.ifmo.se.pokemon.Team
        Object foesObj = foesField.get(b);
        
        Field foesTeamField = foesTeamClassExample.getDeclaredField("team");
        // Queoe<Pokemon> team

        foesTeamField.setAccessible(true);
        Queue<Pokemon> foes = (Queue<Pokemon>) foesTeamField.get(foesObj);
        // -> [p1, p... Pokemons in team]



        // return true;
         if (foes.isEmpty()) {
            System.out.println("G-Команда пустовата для начала битвы");
            return false;
        } else if (allies.isEmpty()) {
            System.out.println("T-Команда пустовата для начала битвы");
            return false;
        } else { return true; }
    }
}