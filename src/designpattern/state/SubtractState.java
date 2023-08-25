package designpattern.state;

import designpattern.composite.Directory;

public class SubtractState implements Arithmetic{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
