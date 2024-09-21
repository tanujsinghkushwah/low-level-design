package org.example.observerdesign;

import org.example.observerdesign.interfaces.ObserverInterface;
import org.example.observerdesign.models.Observable;
import org.example.observerdesign.models.Observer;

public class RunObserver {

    public void runDesignPattern() {
        Observable observable = new Observable();
        Observer observer = new Observer();

        observable.add(observer);

        observable.setData(10);
        observable.setData(10);
    }
}
