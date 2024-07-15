package org.designPatterns.c20_Observer;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Chen Hao
 * @date 2024/7/15 23:45
 */


public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
