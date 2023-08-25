package designpattern.abstractfactory;

public class AndroidFactory implements PhoneFactory{

    public Case createCase(){
        return new AndroidCase();
    }
    public Screen createScreen(){
        return new AndroidScreen();
    }
    public Processor createProcessor(){
        return new AndroidProcessor();
    }
    public  MotherBoard createMotherBoard(){
        return new AndroidMotherBoard();
    }
    public Battery createBattery(){
        return new AndroidBattery();
    }
}
