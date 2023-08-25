package designpattern.strategy;

public class nonEmptyValidator implements ValidatorStrategy{
    @Override
    public void validateData(String[] data) {
        if (data[0] == null || data[0].length() == 0)
            throw new RuntimeException("not empty check failed for value:" + data[1]);
    }
}
