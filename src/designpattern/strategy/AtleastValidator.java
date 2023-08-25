package designpattern.strategy;

public class AtleastValidator implements ValidatorStrategy{
    @Override
    public void validateData(String[] data){
        if (Integer.parseInt(data[0]) < Integer.parseInt(data[1]))
            throw new RuntimeException("at least check failed:" + Integer.parseInt(data[0]));
    }
}
