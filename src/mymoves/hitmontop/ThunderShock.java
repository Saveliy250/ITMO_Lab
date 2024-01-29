package mymoves.hitmontop;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderShock extends SpecialMove {

    public ThunderShock(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Program.chance(0.1)) {
            Effect.paralyze(p);
        }
    }

    protected String describe() {
        return "does ThunderShock";
    }
}