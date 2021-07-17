/**
 * @author giuliano ranauro
 * Date: 17/07/2021 16:03
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Sensor implements Subject{
    private List<Observer> observers = new ArrayList<>();

    public void readData(){
        /**read data*/
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers)
            o.update();

    }
}
