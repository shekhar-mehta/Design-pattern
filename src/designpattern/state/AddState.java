package designpattern.state;

public class AddState implements Arithmetic{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
