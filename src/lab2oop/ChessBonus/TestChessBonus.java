package lab2oop.ChessBonus;
import java.util.Scanner;

public class TestChessBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BonusBoard game = new BonusBoard();

        game.setup();

        while (true) {

            game.draw();

            System.out.println(game.turn + " move:");

            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            boolean finished =
                    game.move(r1, c1, r2, c2);

            if (finished)
                break;
        }

        System.out.println("GAME OVER");
    }
}