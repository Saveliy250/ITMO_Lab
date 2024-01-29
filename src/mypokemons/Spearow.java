package mypokemons;

import mymoves.spearow.Blizzard;
import mymoves.spearow.IceBeam;
import mymoves.spearow.RollingKick;
import mymoves.spearow.ThunderShock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spearow extends Pokemon {

    public Spearow(String name, int level){ //public доступен из любого другого класса
        super(name, level);

        super.setType(Type.NORMAL, Type.FLYING);
        super.setStats(40, 60, 30, 31, 31, 70);

        Blizzard blizzard = new Blizzard(110, 70);
        IceBeam iceBeam = new IceBeam(90, 100);
        RollingKick rollingKick = new RollingKick(60, 85);
        ThunderShock thunderShock = new ThunderShock(40, 100);

        super.setMove(blizzard, iceBeam, rollingKick, thunderShock);

    }
}
