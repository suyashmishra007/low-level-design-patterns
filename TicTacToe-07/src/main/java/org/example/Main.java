package org.example;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        System.out.println("Game winner is "  + ticTacToeGame.startGame());
    }
}
/*
   Objects :
    -> Piece
    -> Board : N x M
    -> Players

   Relation :
    -> Playing Piece : enum pieceType(O,X) , PlayingPiece(Symbol) ,
 */