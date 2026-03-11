package lab2oop.problem2;

public class Rook extends Piece {

    public Rook(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        return position.getRow() == newPosition.getRow() ||
                position.getCol() == newPosition.getCol();
    }
}
