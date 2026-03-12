package lab2oop.ChessBonus;

public class PositionBonus {
    private int row;  // private - инкапсуляция
    private int col;  // private - инкапсуляция

    public PositionBonus(int row, int col) {
        // Валидацияны сақтау керек!
        if (row < 0 || row > 7 || col < 0 || col > 7)
            throw new IllegalArgumentException("Position must be within 0-7");

        this.row = row;
        this.col = col;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }

    public void setRow(int row) {
        if (row < 0 || row > 7)
            throw new IllegalArgumentException("Row must be 0-7");
        this.row = row;
    }

    public void setCol(int col) {
        if (col < 0 || col > 7)
            throw new IllegalArgumentException("Col must be 0-7");
        this.col = col;
    }

    // Бұл әдіс өте маңызды! HashSet және тексерулер үшін
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PositionBonus that = (PositionBonus) obj;
        return row == that.row && col == that.col;
    }

    // equals() әдісін өшірмеу үшін hashCode() да қосу керек
    @Override
    public int hashCode() {
        return 31 * row + col;
    }

    @Override
    public String toString() {
        return "(" + row + "," + col + ")";
    }
}
