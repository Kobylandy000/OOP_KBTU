package lab2oop.ChessBonus;

abstract class PieceBonus {

    PositionBonus pos;
    String color;
    char symbol;

    PieceBonus(PositionBonus p, String c, char s) {

        pos = p;
        color = c;
        symbol = s;
    }

    abstract boolean isLegal(PositionBonus newPos, PieceBonus[][] board);

    char getSymbol() {

        return color.equals("white") ?
                Character.toUpperCase(symbol) :
                Character.toLowerCase(symbol);
    }
}
