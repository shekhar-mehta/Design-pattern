package designpattern.decorator;

public class Registrar {
    public boolean evaluate(Application theApp, Criteria criteria) {
        return criteria.evaluate(theApp);
    }
}
