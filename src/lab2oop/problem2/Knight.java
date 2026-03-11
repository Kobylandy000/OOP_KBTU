package lab2oop.problem2;

public class Knight extends Piece {

    public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {

        int rowDiff = Math.abs(position.getRow() - newPosition.getRow());
        int colDiff = Math.abs(position.getCol() - newPosition.getCol());

        return (rowDiff == 2 && colDiff == 1) ||
                (rowDiff == 1 && colDiff == 2);
    }
}
