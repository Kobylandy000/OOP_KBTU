package lab2oop.problem2;

public class Pawn extends Piece {

    private boolean isWhite;
    private boolean hasMoved; // пешканың бірінші жүріс жасағанын бақылау

    public Pawn(Position position, boolean isWhite) {
        super(position);
        this.isWhite = isWhite;
        this.hasMoved = false; // бастапқыда пешка әлі жүрмеген
    }

    @Override
    public boolean isLegalMove(Position newPosition) {

        int direction = isWhite ? 1 : -1; // ақ пешкалар жоғары (row+1), қара пешкалар төмен (row-1)
        int currentRow = position.getRow();
        int currentCol = position.getCol();
        int newRow = newPosition.getRow();
        int newCol = newPosition.getCol();

        // Бірінші жүрісте 1 немесе 2 қадам алға жүре алады
        if (!hasMoved) {
            // Бір қадам алға
            if (newCol == currentCol && newRow == currentRow + direction) {
                hasMoved = true;
                return true;
            }
            // Екі қадам алға (тек бірінші жүрісте)
            if (newCol == currentCol && newRow == currentRow + (2 * direction)) {
                hasMoved = true;
                return true;
            }
        }
        // Бірінші жүрістен кейін тек 1 қадам алға
        else {
            if (newCol == currentCol && newRow == currentRow + direction) {
                return true;
            }
        }
        return false;
    }

    public boolean hasMoved() {
        return hasMoved;
    }
}