package lab2oop.ChessBonus;

class HorseBonus extends PieceBonus {

    HorseBonus(PositionBonus p, String c) {
        super(p, c, 'h');
    }

    @Override
    boolean isLegalMove(PositionBonus n, PieceBonus[][] board) {
        int rowDiff = Math.abs(pos.getRow() - n.getRow());
        int colDiff = Math.abs(pos.getCol() - n.getCol());

        // Ат "Г" әрпімен жүреді: (2,1) немесе (1,2)
        return (rowDiff == 2 && colDiff == 1) ||
                (rowDiff == 1 && colDiff == 2);
    }
}