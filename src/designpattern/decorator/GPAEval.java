package designpattern.decorator;

public class GPAEval extends Decorator{
    Criteria criteria;
    GPAEval(Criteria criteria){
        super(criteria);
    }
    @Override
    public boolean evaluate(Application theApp) {
        System.out.println("GPAEval called");
        return theApp.getGpa() > 8;
    }
}
