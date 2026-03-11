package lab2oop.problem2;

public class Pawn extends Piece {

    private boolean isWhite;

    public Pawn(Position position, boolean isWhite) {
        super(position);
        this.isWhite = isWhite;
    }

    @Override
    public boolean isLegalMove(Position newPosition) {

        int direction = isWhite ? 1 : -1;

        return newPosition.getCol() == position.getCol() &&
                newPosition.getRow() == position.getRow() + direction;
    }
}
