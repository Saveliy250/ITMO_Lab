package mypokemons;


import mymoves.duskull.Confusion;
import mymoves.duskull.ShadowPunch;
import mymoves.duskull.ThunderShock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Duskull extends Pokemon {

    public Duskull(String name, int level){
        super(name, level);

        super.setType(Type.GHOST);
        super.setStats(20, 40, 90, 30, 90, 25);

        ThunderShock thunderShock = new ThunderShock(40, 100);
        ShadowPunch shadowPunch = new ShadowPunch(60, Double.POSITIVE_INFINITY);
        Confusion confusion = new Confusion(50, 100);

        super.setMove(thunderShock, shadowPunch, confusion);

    }
}
