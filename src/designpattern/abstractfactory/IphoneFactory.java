package designpattern.abstractfactory;

public class IphoneFactory implements PhoneFactory{
    public Case createCase(){
        return new IphoneCase();
    }
    public Screen createScreen(){
        return new IphoneScreen();
    }
    public Processor createProcessor(){
        return new IphoneProcessor();
    }
    public  MotherBoard createMotherBoard(){
        return new IphoneMotherBoard();
    }
    public Battery createBattery(){
        return new IphoneBattery();
    }
}
