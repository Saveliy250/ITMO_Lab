package mypokemons;


import mymoves.vibrava.HydroPump;
import mymoves.vibrava.ShadowPunch;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vibrava extends Pokemon {

    public Vibrava(String name, int level){
        super(name, level);

        super.setType(Type.GROUND, Type.DRAGON);
        super.setStats(50, 70, 50, 50, 50, 70);

        ShadowPunch shadowPunch = new ShadowPunch(60, Double.POSITIVE_INFINITY);
        HydroPump hydroPump = new HydroPump(110, 80);

        super.setMove(shadowPunch, hydroPump);

    }
}