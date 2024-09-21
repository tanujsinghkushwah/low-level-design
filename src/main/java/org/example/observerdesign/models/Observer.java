package org.example.observerdesign.models;

import org.example.observerdesign.interfaces.ObserverInterface;

public class Observer implements ObserverInterface {
    @Override
    public void update() {
        System.out.println("Received stock update notification!!!");
    }
}
