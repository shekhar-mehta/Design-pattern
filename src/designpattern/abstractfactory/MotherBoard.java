package designpattern.abstractfactory;

public class MotherBoard {
    private Battery battery;
    private String state;
    private Processor processor;

    public void attachBattery(Battery battery) {
        this.battery = battery;
    }

    public void attachProcessor(Processor processor) {
        if (battery == null)
            throw new RuntimeException("Cant attach processor without attaching battery");
        this.processor = processor;
        this.state = "running";
    }

    public String State() {
        return state;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Battery getBattery() {
        return battery;
    }
}
