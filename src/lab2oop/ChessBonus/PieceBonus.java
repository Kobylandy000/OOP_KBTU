package lab2oop.ChessBonus;

abstract class PieceBonus {
    protected PositionBonus pos;  // protected - мұрагер класстар қолдана алады
    protected String color;
    protected char symbol;

    PieceBonus(PositionBonus p, String c, char s) {
        if (p == null) {
            throw new IllegalArgumentException("Position cannot be null!");
        }
        if (c == null || (!c.equals("white") && !c.equals("black"))) {
            throw new IllegalArgumentException("Color must be 'white' or 'black'!");
        }

        this.pos = p;
        this.color = c;
        this.symbol = s;
    }

    // Абстрактты әдіс - әр фигура өзінше іске асырады
    abstract boolean isLegalMove(PositionBonus newPos, PieceBonus[][] board);

    // getSymbol() әдісі (бұрынғысы жақсы, бірақ кеңейтейік)
    char getSymbol() {
        // Ақ фигуралар - БАС ӘРІП, қара фигуралар - кіші әріп
        return color.equals("white") ?
                Character.toUpperCase(symbol) :
                Character.toLowerCase(symbol);
    }

    // Getter әдістері
    public PositionBonus getPosition() {
        return pos;
    }

    public String getColor() {
        return color;
    }

    // Setter әдісі - позицияны өзгерту үшін
    public void setPosition(PositionBonus newPos) {
        if (newPos == null) {
            throw new IllegalArgumentException("Position cannot be null!");
        }
        this.pos = newPos;
    }

    // Көмекші әдіс - позицияны тексеру үшін
    protected boolean isWithinBoard(PositionBonus p) {
        return p != null && p.getRow() >= 0 && p.getRow() < 8 &&
                p.getCol() >= 0 && p.getCol() < 8;
    }

    // Көмекші әдіс - бағытты анықтау үшін
    protected int getDirection() {
        return color.equals("white") ? -1 : 1;  // Ақ жоғары (-1), қара төмен (+1)
    }

    @Override
    public String toString() {
        return color + " " + getSymbol() + " at " + pos;
    }
}