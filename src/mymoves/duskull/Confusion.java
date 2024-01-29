package mymoves.duskull;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Confusion extends SpecialMove {
    public Confusion(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Program.chance(0.1)) {
            Effect.confuse(p);
        }
    }

    protected String describe() {
        return "does Confusion";
    }
}
