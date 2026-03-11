package lab2oop.ChessBonus;

class HorseBonus extends PieceBonus {

    HorseBonus(PositionBonus p, String c) {
        super(p, c, 'h');
    }

    boolean isLegal(PositionBonus n, PieceBonus[][] board) {

        int rowDiff = Math.abs(pos.row - n.row);
        int colDiff = Math.abs(pos.col - n.col);

        return (rowDiff == 2 && colDiff == 1) ||
                (rowDiff == 1 && colDiff == 2);
    }
}