package mymoves.umbreon;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove {
    public HydroPump(double pow, double acc){
        super(Type.WATER, pow, acc);

    }


    protected String describe() {
        return "does HydroPump";
    }
}