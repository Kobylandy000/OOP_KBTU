package lab2oop.ChessBonus;

class QueenBonus extends PieceBonus {

    QueenBonus(PositionBonus p, String c) {
        super(p, c, 'q');
    }

    @Override
    boolean isLegalMove(PositionBonus n, PieceBonus[][] board) {
        int rowDiff = Math.abs(pos.getRow() - n.getRow());
        int colDiff = Math.abs(pos.getCol() - n.getCol());

        // Өз орнына қайта жүруге болмайды
        if (rowDiff == 0 && colDiff == 0) {
            return false;
        }

        // Тура (қала сияқты) НЕМЕСЕ диагональ (піл сияқты)
        return rowDiff == colDiff ||
                pos.getRow() == n.getRow() ||
                pos.getCol() == n.getCol();
    }
}