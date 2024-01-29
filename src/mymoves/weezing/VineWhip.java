package mymoves.weezing;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class VineWhip extends PhysicalMove {
    public VineWhip(double pow, double acc){
        super(Type.GRASS, pow, acc);

    }


    protected String describe() {
        return "does VineWhip";
    }
}