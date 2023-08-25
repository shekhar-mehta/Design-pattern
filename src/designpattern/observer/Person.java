package designpattern.observer;

public class Person implements Subscriber{
    private boolean outdoors;
    private boolean feelingWarm;
    private boolean feelingTired;

    public boolean isFeelingWarm() {
        return feelingWarm;
    }

    public void goOutdoors() {
        outdoors = true;
    }

    public void goIndoors() {
        outdoors = false;
    }

    @Override
    public boolean isOutdoors() {
        return outdoors;
    }
    @Override
    public void notifySunRise() {
        feelingWarm = true;
    }

    @Override
    public void notifySunSet() {
        feelingWarm = false;
        if (outdoors)
            feelingTired = true;
    }

    public boolean isFeelingTired() {
        return feelingTired;
    }
}
