import board.Board;
import piece.Piece;
import piece.PieceO;
import player.Player;

import java.util.ArrayDeque;
import java.util.Deque;

public class TicTacToeGame {

    private Board board;
    private Deque<Player> players;

    public void initialse(){
        board = new Board(3);
        players = new ArrayDeque<>();
        Piece po = new PieceO();

    }
}
