package mypokemons;


import mymoves.weezing.HydroPump;
import mymoves.weezing.ShadowPunch;
import mymoves.weezing.VineWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Weezing extends Pokemon {

    public Weezing(String name, int level){
        super(name, level);

        super.setType(Type.POISON);
        super.setStats(65, 90, 120, 85, 70, 60);

        ShadowPunch shadowPunch = new ShadowPunch(60, Double.POSITIVE_INFINITY);
        HydroPump hydroPump = new HydroPump(110, 80);
        VineWhip vineWhip = new VineWhip(45, 100);

        super.setMove(shadowPunch, hydroPump, vineWhip);


    }
}