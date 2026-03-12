package lab2oop.ChessBonus;

class PawnBonus extends PieceBonus {

    PawnBonus(PositionBonus p, String c) {
        super(p, c, 'p');
    }

    @Override
    boolean isLegalMove(PositionBonus n, PieceBonus[][] board) {
        int dir = color.equals("white") ? -1 : 1;
        int rowDiff = n.getRow() - pos.getRow();
        int colDiff = Math.abs(n.getCol() - pos.getCol());

        // Алға 1 қадам (бос ұяшық)
        if (colDiff == 0 && rowDiff == dir && board[n.getRow()][n.getCol()] == null) {
            return true;
        }

        // Алға 2 қадам (тек бастапқы қалыптан)
        boolean isStartingRow = (color.equals("white") && pos.getRow() == 6) ||
                (color.equals("black") && pos.getRow() == 1);
        if (colDiff == 0 && rowDiff == 2 * dir && isStartingRow) {
            int middleRow = pos.getRow() + dir;
            if (board[middleRow][pos.getCol()] == null &&
                    board[n.getRow()][n.getCol()] == null) {
                return true;
            }
        }

        // Қарсыласты жеу (диагональ)
        if (colDiff == 1 && rowDiff == dir) {
            if (board[n.getRow()][n.getCol()] != null &&
                    !board[n.getRow()][n.getCol()].getColor().equals(this.color)) {
                return true;
            }
        }

        return false;
    }
}