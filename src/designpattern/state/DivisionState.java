package designpattern.state;

public class DivisionState implements Arithmetic{
    @Override
    public int calculate(int a, int b) {
        return a/b;
    }
}
