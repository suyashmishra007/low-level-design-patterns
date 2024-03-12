package org.example.tictactoe;

import org.example.tictactoe.model.Board;
import org.example.tictactoe.model.Player;

import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        /*
         Objects -> Pieces, Board , Player
        */
        TicTacToeGame game = new TicTacToeGame();
        System.out.println("Game winner is " + game.startGame());
    }
}
