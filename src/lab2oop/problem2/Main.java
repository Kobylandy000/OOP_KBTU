package lab2oop.problem2;

public class Main {
    public static void main(String[] args) {

        Piece rook = new Rook(new Position(2,2));
        System.out.println("Rook move: " + rook.isLegalMove(new Position(2,7)));

        Piece bishop = new Bishop(new Position(3,3));
        System.out.println("Bishop move: " + bishop.isLegalMove(new Position(5,5)));
        System.out.println("Bishop move: " + bishop.isLegalMove(new Position(3,6)));

        Piece knight = new Knight(new Position(4,4));
        System.out.println("Knight move: " + knight.isLegalMove(new Position(6,5)));

        Piece queen = new Queen(new Position(1,1));
        System.out.println("Queen move: " + queen.isLegalMove(new Position(4,4)));

        Piece king = new King(new Position(5,5));
        System.out.println("King move: " + king.isLegalMove(new Position(6,6)));

        Piece pawnWhite = new Pawn(new Position(2,3), true);
        System.out.println("White pawn move: " + pawnWhite.isLegalMove(new Position(3,3)));

        Piece pawnBlack = new Pawn(new Position(7,3), false);
        System.out.println("Black pawn move: " + pawnBlack.isLegalMove(new Position(6,3)));
    }
}
