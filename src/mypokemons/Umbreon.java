package mypokemons;


import mymoves.umbreon.HydroPump;
import mymoves.umbreon.MudSlap;
import mymoves.umbreon.ShadowPunch;
import mymoves.umbreon.VineWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Umbreon extends Pokemon {

    public Umbreon(String name, int level){
        super(name, level);

        super.setType(Type.DARK);
        super.setStats(90, 70, 115, 45, 130, 65);

        ShadowPunch shadowPunch = new ShadowPunch(60, Double.POSITIVE_INFINITY);
        HydroPump hydroPump = new HydroPump(110, 80);
        VineWhip vineWhip = new VineWhip(45, 1000);
        MudSlap mudSlap = new MudSlap(20, 100);

        super.setMove(shadowPunch, hydroPump, vineWhip, mudSlap);

    }
}