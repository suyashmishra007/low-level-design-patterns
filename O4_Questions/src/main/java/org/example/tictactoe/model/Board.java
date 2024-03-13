package org.example.tictactoe.model;

import java.util.*;

public class Board {
    public int size;
    public PlayingPiece[][] board;
    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row , int col , PlayingPiece piece){
        if(board[row][col] != null){
            return false;
        }
        board[row][col] = piece;
        return true;
    }
    public List<PairUtil> getFreeCells() {
        List<PairUtil> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    PairUtil rowColumn = new PairUtil(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
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
