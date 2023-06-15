
package chess;

import boardgame.Board;

public class ChessMatch {
    private Board board;
    
    public ChessMatch(){
        //a classe que precisa saber o tamanho do tabuleiro é esta
        //portanto, o construtor instancia um novo tabuleiro.
        board = new Board(8, 8);
    }
    
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i=0; i<board.getRows(); i++){
            for(int j=0; j<board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
                //downcasting que faz o programa interpretar o Piece
                //como uma peça de xadrez.
            }
        }
        return mat;
    }
    
}
