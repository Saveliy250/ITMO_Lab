package lab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Program {


    public static void main(String[] args) {
        Battle b = new Battle();
        Duskull duskull = new Duskull("Maxim", 1);
        Spearow spearow = new Spearow("Alex", 1);
        Hitmontop hitmontop = new Hitmontop("Oleg", 1);
        Umbreon umbreon = new Umbreon("Andrey", 1);
        Vibrava vibrava = new Vibrava("Anatoliy", 1);
        Weezing weezing = new Weezing("Misha", 1);

        b.addAlly(duskull);
        b.addAlly(umbreon);
        b.addAlly(hitmontop);

        b.addFoe(vibrava);
        b.addFoe(spearow);
        b.addFoe(weezing);
        b.go();
    }

    public static boolean chance(double d) {
        return d > Math.random();
    }
}