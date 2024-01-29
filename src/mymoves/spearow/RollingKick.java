package mymoves.spearow;

import lab2.Program;
import ru.ifmo.se.pokemon.*;

public class RollingKick extends PhysicalMove {

    public RollingKick(double pow, double acc){
        super(Type.FIGHTING, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Program.chance(0.3)) {
            Effect.flinch(p);
        }
    }

    protected String describe() {
        return "does RollingKick";
    }
}
