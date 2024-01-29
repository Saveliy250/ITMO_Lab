package mypokemons;


import mymoves.hitmontop.ShadowPunch;
import mymoves.hitmontop.ThunderShock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hitmontop extends Pokemon {

    public Hitmontop(String name, int level){
        super(name, level);

        super.setType(Type.FIGHTING);
        super.setStats(50, 95, 95, 35, 110, 70);

        ThunderShock thunderShock = new ThunderShock(40, 100);
        ShadowPunch shadowPunch = new ShadowPunch(60, Double.POSITIVE_INFINITY);

        super.setMove(thunderShock, shadowPunch);


    }
}