package mymoves.vibrava;

import lab2.Program;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ShadowPunch extends PhysicalMove {
    public ShadowPunch(double pow, double acc){
        super(Type.GHOST, pow, acc);

    }


    protected String describe() {
        return "does ShadowPunch";
    }
}