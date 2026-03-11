package lab2oop.ChessBonus;

class RookBonus extends PieceBonus {

    RookBonus(PositionBonus p, String c) {
        super(p, c, 'r');
    }

    boolean isLegal(PositionBonus n, PieceBonus[][] board) {

        if (pos.row != n.row && pos.col != n.col)
            return false;

        return true;
    }
}