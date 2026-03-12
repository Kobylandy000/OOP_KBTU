package lab2oop.ChessBonus;

class KingBonus extends PieceBonus {

    KingBonus(PositionBonus p, String c) {
        super(p, c, 'k');
    }

    @Override
    boolean isLegalMove(PositionBonus n, PieceBonus[][] board) {
        int dr = Math.abs(pos.getRow() - n.getRow());
        int dc = Math.abs(pos.getCol() - n.getCol());

        // Патша кез келген бағытта 1 қадам ғана жүре алады
        // Бірақ өз орнына қайта жүрмеу керек
        return dr <= 1 && dc <= 1 && (dr + dc > 0);
    }
}