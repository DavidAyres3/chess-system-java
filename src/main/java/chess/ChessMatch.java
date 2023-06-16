
package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rock;

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
    
    //método responsável por iniciar a partida colocando as peças no tabuleiro
    private void initialSetup(){
        board.placePiece(new Rock(Color.WHITE, board), new Position(2, 1));
        board.placePiece(new King(Color.WHITE, board), new Position(0, 4));
        board.placePiece(new King(Color.BLACK, board), new Position(7, 4));
    }
    
}
