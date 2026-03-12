package lab2oop.ChessBonus;

class RookBonus extends PieceBonus {

    RookBonus(PositionBonus p, String c) {
        super(p, c, 'r');
    }

    @Override
    boolean isLegalMove(PositionBonus n, PieceBonus[][] board) {
        // Бір жолда немесе бір бағанда болу керек
        if (pos.getRow() != n.getRow() && pos.getCol() != n.getCol()) {
            return false;
        }

        // Өз орнына қайта жүруге болмайды
        if (pos.getRow() == n.getRow() && pos.getCol() == n.getCol()) {
            return false;
        }

        return true;
    }
}