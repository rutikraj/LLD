package board;

import piece.Piece;

public class Board {
    private int size;
    private Piece[][] pieces;

    public Board(int size) {
        this.size = size;
        this.pieces = new Piece[size][size];
    }
}
