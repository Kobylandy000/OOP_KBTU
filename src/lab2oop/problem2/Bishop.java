package lab2oop.problem2;

public class Bishop extends Piece {

    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {

        int rowDiff = Math.abs(position.getRow() - newPosition.getRow());
        int colDiff = Math.abs(position.getCol() - newPosition.getCol());

        return rowDiff == colDiff;
    }
}
