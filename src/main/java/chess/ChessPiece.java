
package chess;

import boardgame.Board;
import boardgame.Piece;

//classe de definição de cor da peça do jogo.
public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    
}
