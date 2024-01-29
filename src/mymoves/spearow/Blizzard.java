package mymoves.spearow;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends SpecialMove {

    // конструктор аттаки
    public Blizzard(double pow, double acc){
        super(Type.ICE, pow, acc); // на первой строке конструктора тк иницилизация объектов идет по иерархии, значит если что то будет между то оно будет неопределено

    }

    @Override // переопределение метода applyOppEffects из класса Move
    protected void applyOppEffects(Pokemon p) { //"protected" доступен только внутри класса, в подклассах и втом же пакете(Spearow)
        super.applyOppEffects(p); // super позволяет выполнить реализацию метода из суперкласса перед добавлением или изменением поведения в подклассе

        if(Program.chance(0.1)) {
            Effect.freeze(p); // вызов эффекта из библиотеки
        }
    }

    protected String describe() { //вызов метода из класса Move возвращает только строку
        return "does Blizzard";
    }
}
