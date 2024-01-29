package mymoves.umbreon;


import ru.ifmo.se.pokemon.*;

public class MudSlap extends SpecialMove {

    public MudSlap(double pow, double acc){
        super(Type.GROUND, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        Effect e = new Effect().stat(Stat.ACCURACY, -1);
        p.addEffect(e);

    }

    protected String describe() {
        return "does MudSlap";
    }
}
