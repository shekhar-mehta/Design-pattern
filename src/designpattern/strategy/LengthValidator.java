package designpattern.strategy;

public class LengthValidator implements ValidatorStrategy{
    public void validateData(String[] data) {
        if (data[0].length() > Integer.parseInt(data[1]))
            throw new RuntimeException("Invalid length: " + data[1]);
    }
}
