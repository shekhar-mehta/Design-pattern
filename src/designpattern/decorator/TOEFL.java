package designpattern.decorator;

public class TOEFL extends Decorator{
    TOEFL(Criteria criteria) {
        super(criteria);
    }
    @Override
    public boolean evaluate(Application theApp) {
        return super.evaluate(theApp) && theApp.getToefl() > 100;
    }
}
