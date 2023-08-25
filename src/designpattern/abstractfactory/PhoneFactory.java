package designpattern.abstractfactory;

public interface PhoneFactory {
    public abstract Case createCase();
    public abstract Screen createScreen();
    public abstract Battery createBattery();
    public abstract MotherBoard createMotherBoard();
    public abstract Processor createProcessor();
}
