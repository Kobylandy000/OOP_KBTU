package lab2oop.ChessBonus;

class BishopBonus extends PieceBonus {

    BishopBonus(PositionBonus p, String c) {
        super(p, c, 'b');
    }

    boolean isLegal(PositionBonus n, PieceBonus[][] board) {

        int rowDiff = Math.abs(pos.row - n.row);
        int colDiff = Math.abs(pos.col - n.col);

        return rowDiff == colDiff;
    }
}