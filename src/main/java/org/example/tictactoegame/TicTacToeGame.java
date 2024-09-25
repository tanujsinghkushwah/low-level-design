package org.example.tictactoegame;

import javafx.util.Pair;
import org.example.tictactoegame.models.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> playerDeque;
    Board board;

    public void initializeBoard() {
        playerDeque = new LinkedList<>();
        PieceX pieceX = new PieceX();
        Player player1 = new Player("Player1", pieceX);
        playerDeque.add(player1);

        PieceO pieceO = new PieceO();
        Player player2 = new Player("Player2", pieceO);
        playerDeque.add(player2);

        board = new Board(3);
    }

    public String runGame() {
        Boolean nowinner = true;
        while(nowinner) {
            Player playerTurn = playerDeque.removeFirst();

            board.displayBoard();
            List<Pair<Integer, Integer>> freeCells = board.getFreeSpaces();
            if(freeCells.isEmpty()){
                nowinner=true;
                continue;
            }

            System.out.println(playerTurn.getName()+" Enter coordinates for position: ");
            Scanner scanner = new Scanner(System.in);
            String value = scanner.nextLine();
            String[] values = value.split(",");
            Integer row = Integer.valueOf(values[0]);
            Integer column = Integer.valueOf(values[1]);

            Boolean chance = board.addPiece(row, column, playerTurn.getPlayingPiece());
            if(!chance) {
                System.out.println("Incorrect position for placement.");
                playerDeque.addFirst(playerTurn);
                continue;
            }
            playerDeque.addLast(playerTurn);

            Boolean isWinner = checkWinner(row, column, playerTurn.getPlayingPiece().pieceType);
            if(isWinner)
                return playerTurn.getName()+" wins";
        }
        return "tie";
    }

    private Boolean checkWinner(Integer row, Integer column, PieceType pieceType) {
        boolean rowFlag = true;
        boolean colFlag = true;
        boolean diagonal = true;
        boolean antiDiagonal = true;

        for(int i=0;i<board.size;i++) {
            if(board.board[row][i]==null || board.board[row][i].pieceType!=pieceType) {
                rowFlag=false;
                break;
            }
        }

        for(int i=0;i<board.size;i++) {
            if(board.board[i][column]==null || board.board[i][column].pieceType!=pieceType) {
                colFlag = false;
                break;
            }
        }

        for (int i=0, j=0;i<board.size;i++,j++) {
            if(board.board[i][j]==null || board.board[i][j].pieceType!=pieceType) {
                diagonal = false;
                break;
            }
        }

        for (int i=0, j= board.size-1;i<board.size;i++,j--) {
            if(board.board[i][j]==null || board.board[i][j].pieceType!=pieceType) {
                antiDiagonal = false;
                break;
            }
        }

        return rowFlag || colFlag || diagonal || antiDiagonal;
    }
}
