package lab2oop.ChessBonus;

public class BonusBoard {
    PieceBonus[][] board = new PieceBonus[8][8];
    String turn = "white";

    void setup() {
        // Қара фигуралар
        board[0][0] = new RookBonus(new PositionBonus(0, 0), "black");
        board[0][1] = new HorseBonus(new PositionBonus(0, 1), "black");
        board[0][2] = new BishopBonus(new PositionBonus(0, 2), "black");
        board[0][3] = new QueenBonus(new PositionBonus(0, 3), "black");
        board[0][4] = new KingBonus(new PositionBonus(0, 4), "black");
        board[0][5] = new BishopBonus(new PositionBonus(0, 5), "black");
        board[0][6] = new HorseBonus(new PositionBonus(0, 6), "black");
        board[0][7] = new RookBonus(new PositionBonus(0, 7), "black");

        // Қара пешкалар
        for (int i = 0; i < 8; i++) {
            board[1][i] = new PawnBonus(new PositionBonus(1, i), "black");
        }

        // Ақ фигуралар
        board[7][0] = new RookBonus(new PositionBonus(7, 0), "white");
        board[7][1] = new HorseBonus(new PositionBonus(7, 1), "white");
        board[7][2] = new BishopBonus(new PositionBonus(7, 2), "white");
        board[7][3] = new QueenBonus(new PositionBonus(7, 3), "white");
        board[7][4] = new KingBonus(new PositionBonus(7, 4), "white");
        board[7][5] = new BishopBonus(new PositionBonus(7, 5), "white");
        board[7][6] = new HorseBonus(new PositionBonus(7, 6), "white");
        board[7][7] = new RookBonus(new PositionBonus(7, 7), "white");

        // Ақ пешкалар
        for (int i = 0; i < 8; i++) {
            board[6][i] = new PawnBonus(new PositionBonus(6, i), "white");
        }
    }

    void draw() {
        System.out.println("\n  a b c d e f g h");
        System.out.println("  ---------------");

        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " ");  // Жол нөмірі

            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j].getSymbol() + " ");
                }
            }

            System.out.println(8 - i);  // Жол нөмірі (оң жақта)
        }

        System.out.println("  ---------------");
        System.out.println("  a b c d e f g h");
        System.out.println("\n" + turn + "'s turn");
    }

    boolean isPathClear(int r1, int c1, int r2, int c2) {
        int dr = Integer.signum(r2 - r1);
        int dc = Integer.signum(c2 - c1);

        int r = r1 + dr;
        int c = c1 + dc;

        while (r != r2 || c != c2) {
            // Егер шахмат тақтасынан тыс кетсе
            if (r < 0 || r >= 8 || c < 0 || c >= 8) {
                return false;
            }

            if (board[r][c] != null) {
                return false;  // Жолда фигура тұр
            }

            r += dr;
            c += dc;
        }

        return true;
    }

    boolean makeMove(int r1, int c1, int r2, int c2) {
        // Тақтадан тыс координаттарды тексеру
        if (r1 < 0 || r1 >= 8 || c1 < 0 || c1 >= 8 ||
                r2 < 0 || r2 >= 8 || c2 < 0 || c2 >= 8) {
            System.out.println("Invalid coordinates!");
            return false;
        }

        PieceBonus piece = board[r1][c1];

        // 1. Фигура бар ма?
        if (piece == null) {
            System.out.println("No piece at (" + r1 + "," + c1 + ")!");
            return false;
        }

        // 2. Кезек дұрыс па?
        if (!piece.getColor().equals(turn)) {
            System.out.println("It's " + turn + "'s turn! This is " + piece.getColor() + " piece.");
            return false;
        }

        // 3. Өз фигураңды жей алмайсың
        if (board[r2][c2] != null && board[r2][c2].getColor().equals(turn)) {
            System.out.println("Cannot capture your own piece!");
            return false;
        }

        PositionBonus newPos = new PositionBonus(r2, c2);

        // 4. Жүріс заңды ма?
        if (!piece.isLegalMove(newPos, board)) {
            System.out.println("Illegal move for this piece!");
            return false;
        }

        // 5. Жолдың тазалығын тексеру (аттан басқа фигуралар үшін)
        if (!(piece instanceof HorseBonus) && !isPathClear(r1, c1, r2, c2)) {
            System.out.println("Path is blocked by another piece!");
            return false;
        }

        // 6. Патты ұтты ма?
        if (board[r2][c2] instanceof KingBonus) {
            System.out.println("\n🏆 " + turn.toUpperCase() + " WINS! 🏆");
            System.out.println("Game over!");
            return true;  // Ойын аяқталды
        }

        // 7. Фигураны жылжыту
        board[r2][c2] = piece;
        board[r1][c1] = null;
        piece.setPosition(newPos);  // Позицияны жаңарту

        // 8. Кезекті ауыстыру
        turn = turn.equals("white") ? "black" : "white";

        return false;  // Ойын жалғасады
    }

    // Координаттарды түрлендіру әдістері (қосымша ыңғайлылық үшін)
    int[] chessNotationToIndices(String pos) {
        // Мысалы: "e2" -> [6, 4] (егер 0-индекстелген жолдар жоғарыдан төмен болса)
        if (pos.length() != 2) return null;

        char colChar = pos.charAt(0);
        char rowChar = pos.charAt(1);

        int col = colChar - 'a';
        int row = 8 - (rowChar - '0');

        if (col < 0 || col >= 8 || row < 0 || row >= 8) return null;

        return new int[]{row, col};
    }
}