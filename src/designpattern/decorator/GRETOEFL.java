package designpattern.decorator;

public class GRETOEFL extends GREEval{
    GRETOEFL(Criteria criteria) {
        super(criteria);
    }

    @Override
    public boolean evaluate(Application theApp) {
        return super.evaluate(theApp)
                && theApp.getGre() > 1450
                && theApp.getToefl() > 100;
    }
}
