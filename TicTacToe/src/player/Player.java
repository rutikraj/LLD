package player;

import piece.Piece;

public class Player {
    private int id;
    private Piece piece;

    public Player(int id, Piece piece) {
        this.id = id;
        this.piece = piece;
    }
}
