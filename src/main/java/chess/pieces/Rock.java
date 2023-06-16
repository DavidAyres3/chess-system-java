
package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rock extends ChessPiece{
    
    public Rock(Color color, Board board) {
        super(color, board);
    }
    
    @Override
    public String toString(){
        return "R";
    }
    
}
