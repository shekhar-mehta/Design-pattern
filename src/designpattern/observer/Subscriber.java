package designpattern.observer;

public interface Subscriber {
    public void notifySunRise();
    public void notifySunSet();
    public boolean isOutdoors();
}
