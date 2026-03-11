package lab2oop.ChessBonus;

class QueenBonus extends PieceBonus {

    QueenBonus(PositionBonus p, String c) {
        super(p, c, 'q');
    }

    boolean isLegal(PositionBonus n, PieceBonus[][] board) {

        int rowDiff = Math.abs(pos.row - n.row);
        int colDiff = Math.abs(pos.col - n.col);

        return rowDiff == colDiff ||
                pos.row == n.row ||
                pos.col == n.col;
    }
}