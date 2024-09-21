package org.example;

import org.example.observerdesign.RunObserver;
import org.example.strategydesign.RunStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        RunStrategy runStrategy = new RunStrategy();
//        runStrategy.runDesignPattern();

        RunObserver runObserver = new RunObserver();
        runObserver.runDesignPattern();
    }
}