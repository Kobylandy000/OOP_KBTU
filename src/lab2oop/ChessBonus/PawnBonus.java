package lab2oop.ChessBonus;

class PawnBonus extends PieceBonus {

    PawnBonus(PositionBonus p, String c) {
        super(p, c, 'p');
    }

    boolean isLegal(PositionBonus n, PieceBonus[][] board) {
        int dir = color.equals("white") ? -1 : 1;
        if (n.col == pos.col && n.row == pos.row + dir && board[n.row][n.col] == null) return true;
        if (n.col == pos.col && n.row == pos.row + 2*dir && board[pos.row + dir][pos.col] == null && board[n.row][n.col] == null) {
            if ((color.equals("white") && pos.row == 6) || (color.equals("black") && pos.row == 1)) return true;
        }
        return false;
    }
}