
package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;
    
    public ChessMatch(){
        //o construtor instancia um novo tabuleiro 8x8.
        //utilizando a classe Board, que contém  os métodos para instanciação do mesmo.
        board = new Board(8, 8);
        
        //para iniciar a partida, chamamos o initialSetup no construtor.
        initialSetup();
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
    
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    
    //método responsável por iniciar a partida colocando as peças no tabuleiro
    private void initialSetup(){
        placeNewPiece('b', 6, new Rook(Color.WHITE, board));
        placeNewPiece('e', 8, new King(Color.BLACK, board));
        placeNewPiece('e', 1, new King(Color.WHITE, board));
    }
    
}
