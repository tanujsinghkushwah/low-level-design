package org.example;

import org.example.abstractfactorydesign.RunAbstractFactory;
import org.example.decoratordesign.RunDecorator;
import org.example.factorydesign.RunFactory;
import org.example.observerdesign.RunObserver;
import org.example.responsibilitychaindesign.RunChain;
import org.example.strategydesign.RunStrategy;
import org.example.tictactoegame.TicTacToeGame;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        RunStrategy runStrategy = new RunStrategy();
//        runStrategy.runDesignPattern();

//        RunObserver runObserver = new RunObserver();
//        runObserver.runDesignPattern();

//        RunDecorator runDecorator = new RunDecorator();
//        runDecorator.runDesignPattern();

//        RunFactory runFactory = new RunFactory();
//        runFactory.runDesignPattern();

//        RunAbstractFactory runAbstractFactory = new RunAbstractFactory();
//        runAbstractFactory.runDesignPattern();

//        RunChain runChain = new RunChain();
//        runChain.runPattern();

        TicTacToeGame game = new TicTacToeGame();
        game.initializeBoard();
        System.out.println(game.runGame());
    }
}