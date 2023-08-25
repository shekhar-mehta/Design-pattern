package designpattern.observer;

import java.util.ArrayList;

public class Sun {
    private boolean isUp;
    private final Robot robot;
    private final Person person;
    private final Dog dog;
    private final Cat cat;

    private ArrayList<Subscriber> subscribers;
    public Sun(Robot robot, Person person, Dog dog, Cat cat) {
        this.robot = robot;
        this.person = person;
        this.dog = dog;
        this.cat = cat;
        addSubscriber(robot);
        addSubscriber(person);
        addSubscriber(cat);
        addSubscriber(dog);
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber observer){
        subscribers.remove(observer);
    }

    public boolean isUp() {
        return isUp;
    }

    public void set(){
        isUp = false;

        for(Subscriber subscriber : subscribers){
            subscriber.notifySunSet();
        }
    }

    public void rise(){
        isUp = true;
        for(Subscriber subscriber : subscribers){
            subscriber.notifySunRise();
        }
    }
}
