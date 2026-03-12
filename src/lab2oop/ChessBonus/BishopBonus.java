package lab2oop.ChessBonus;

class BishopBonus extends PieceBonus {

    BishopBonus(PositionBonus p, String c) {
        super(p, c, 'b');
    }

    @Override
    boolean isLegalMove(PositionBonus n, PieceBonus[][] board) {
        int rowDiff = Math.abs(pos.getRow() - n.getRow());
        int colDiff = Math.abs(pos.getCol() - n.getCol());

        // Диагональ бойынша жүру керек
        // rowDiff == colDiff және бір орында қалмау керек
        return rowDiff == colDiff && rowDiff > 0;
    }
}