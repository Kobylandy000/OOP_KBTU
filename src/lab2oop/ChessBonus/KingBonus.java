package lab2oop.ChessBonus;

class KingBonus extends PieceBonus {

    KingBonus(PositionBonus p, String c) {
        super(p, c, 'k');
    }

    boolean isLegal(PositionBonus n, PieceBonus[][] board) {

        int dr = Math.abs(pos.row - n.row);
        int dc = Math.abs(pos.col - n.col);

        return dr <= 1 && dc <= 1;
    }
}