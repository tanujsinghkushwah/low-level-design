package org.example.observerdesign.interfaces;

public interface ObservableInterface {

    public void add(ObserverInterface observerInterface);

    public void remove(ObserverInterface observerInterface);

    public void notifyObservers();

    public void setData(int t);
}
