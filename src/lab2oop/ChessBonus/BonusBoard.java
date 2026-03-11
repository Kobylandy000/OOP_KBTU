package lab2oop.ChessBonus;

public class BonusBoard {
    PieceBonus[][] board = new PieceBonus[8][8];

    String turn = "white";


    void setup() {

        board[0][4] = new KingBonus(new PositionBonus(0, 4), "black");
        board[7][4] = new KingBonus(new PositionBonus(7, 4), "white");

        board[0][0] = new RookBonus(new PositionBonus(0, 0), "black");
        board[0][7] = new RookBonus(new PositionBonus(0, 7), "black");
        board[7][0] = new RookBonus(new PositionBonus(7, 0), "white");
        board[7][7] = new RookBonus(new PositionBonus(7, 7), "white");

        board[0][1] = new HorseBonus(new PositionBonus(0,1),"black");
        board[0][6] = new HorseBonus(new PositionBonus(0,6),"black");
        board[7][1] = new HorseBonus(new PositionBonus(7,1),"white");
        board[7][6] = new HorseBonus(new PositionBonus(7,6),"white");

        board[0][2] = new BishopBonus(new PositionBonus(0,2),"black");
        board[0][5] = new BishopBonus(new PositionBonus(0,5),"black");
        board[7][2] = new BishopBonus(new PositionBonus(7,2),"white");
        board[7][5] = new BishopBonus(new PositionBonus(7,5),"white");

        board[0][3] = new QueenBonus(new PositionBonus(0,3),"black");
        board[7][3] = new QueenBonus(new PositionBonus(7,3),"white");

        for (int i = 0; i < 8; i++) {

            board[1][i] = new PawnBonus(new PositionBonus(1, i), "black");
            board[6][i] = new PawnBonus(new PositionBonus(6, i), "white");

        }
    }
    void draw() {

        System.out.println();

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                if (board[i][j] == null)
                    System.out.print(". ");
                else
                    System.out.print(board[i][j].getSymbol() + " ");
            }

            System.out.println();
        }
    }
    boolean move(int r1, int c1, int r2, int c2) {

        PieceBonus p = board[r1][c1];

        if (p == null) {

            System.out.println("No piece!");
            return false;
        }

        if (!p.color.equals(turn)) {

            System.out.println("Wrong turn!");
            return false;
        }

        PositionBonus newPos = new PositionBonus(r2, c2);

        if (!p.isLegal(newPos, board)) {

            System.out.println("Illegal move!");
            return false;
        }

        if (board[r2][c2] instanceof KingBonus) {

            System.out.println(turn + " WINS!");
            return true;
        }

        board[r2][c2] = p;
        board[r1][c1] = null;

        p.pos = newPos;

        turn = turn.equals("white") ? "black" : "white";

        return false;
    }

}
