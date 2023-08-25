package designpattern.decorator;

public class GREEval extends Decorator{
    GREEval(Criteria criteria) {
        super(criteria);
    }
    @Override
    public boolean evaluate(Application theApp) {
        if (super.evaluate(theApp)) {
            System.out.println("GREEval called");
            return theApp.getGre() > 1450;
        } else {
            return false;
        }
    }
}
