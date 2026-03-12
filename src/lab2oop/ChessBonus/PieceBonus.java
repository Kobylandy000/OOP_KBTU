package lab2oop.ChessBonus;

public abstract class PieceBonus {
    protected PositionBonus pos;
    protected String color;

    public PieceBonus(PositionBonus pos, String color) {
        this.pos = pos;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public PositionBonus getPosition() {
        return pos;
    }

    public void setPosition(PositionBonus newPos) {
        this.pos = newPos;
    }

    public abstract boolean isLegalMove(PositionBonus newPos, PieceBonus[][] board);
    public abstract String getSymbol();
}