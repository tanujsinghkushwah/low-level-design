package org.example.observerdesign.models;

import org.example.observerdesign.interfaces.ObservableInterface;
import org.example.observerdesign.interfaces.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class Observable implements ObservableInterface {

    List<ObserverInterface> observerInterfacesList = new ArrayList<>();
    public Integer stock=0;

    @Override
    public void add(ObserverInterface observerInterface) {
        observerInterfacesList.add(observerInterface);
    }

    @Override
    public void remove(ObserverInterface observerInterface) {
        observerInterfacesList.remove(observerInterface);
    }

    @Override
    public void notifyObservers() {
        for(ObserverInterface observerInterface : observerInterfacesList) {
            observerInterface.update();
        }
    }

    @Override
    public void setData(int t) {
        if(stock==0){
            notifyObservers();
        }
        stock=t;
    }

    public Integer getStock() {
        return stock;
    }
}
