package org.example.tictactoegame.models;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Board {

    public Integer size;
    public PlayingPiece[][] board;

    public Board(Integer size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if(board[row][col]!=null) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public boolean removePiece(int row, int col) {
        if(board[row][col]==null) {
            return false;
        }
        board[row][col] = null;
        return true;
    }
    public List<Pair<Integer, Integer>> getFreeSpaces() {
        List<Pair<Integer, Integer>> res = new ArrayList<>();

        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                if(Objects.isNull(board[i][j])) {
                    Pair<Integer, Integer> freeCell = new Pair<>(i, j);
                    res.add(freeCell);
                }
            }
        }
        return res;
    }
    public void displayBoard() {
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
