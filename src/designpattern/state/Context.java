package designpattern.state;

import javax.lang.model.type.ArrayType;
import java.time.temporal.ChronoField;

public class Context {
    Arithmetic arithmeticState;

    public Arithmetic setState(Character c){
        switch (c) {
            case '+':
                return new AddState();
            case '-':
                return new SubtractState();
            case '*':
                return new Multiplicationstate();
            case '/':
                return new DivisionState();
        }
        return null;
    }
}
