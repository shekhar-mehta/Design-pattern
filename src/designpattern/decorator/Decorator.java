package designpattern.decorator;

public  class Decorator implements Criteria{
    Criteria criteria;

    Decorator(Criteria criteria){
        this.criteria = criteria;
    }
    public boolean evaluate(Application theApp){
        return this.criteria.evaluate(theApp);
    }
}
