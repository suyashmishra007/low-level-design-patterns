package org.example.Model;

import java.util.*;

public class Board {

  public int size;
  public PlayingPiece[][]board;


  public Board(int size) {
    this.size = size;
    board = new PlayingPiece[size][size];
  }

  public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
    if (board[row][column] != null) {
      return false;
    }
    board[row][column] = playingPiece;
    return true;
  }

  public List<Position> getFreeCells() {
    List<Position> freeCells = new ArrayList<>();

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (board[i][j] == null) {
          Position position = new Position(i,j);
          freeCells.add(position);
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
