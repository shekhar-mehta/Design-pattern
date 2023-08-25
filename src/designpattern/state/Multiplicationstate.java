package designpattern.state;

public class Multiplicationstate implements Arithmetic{
    @Override
    public int calculate(int a, int b) {
        return a*b;
    }
}
