package lab1.Problem5;

import java.util.Vector;
import java.util.Scanner;



public class DragonLaunch {

    private Vector<Person> kidnapped;

    public DragonLaunch() {
        kidnapped = new Vector<>();
    }

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    public boolean willDragonEatOrNot() {

        Vector<Person> line = new Vector<>(kidnapped);

        boolean changed;
        do {
            changed = false;
            for (int i = 0; i < line.size() - 1; i++) {
                Person current = line.get(i);
                Person next = line.get(i + 1);


                if (current.isBoy() && next.isGirl()) {

                    line.remove(i + 1);  // G
                    line.remove(i);       // B
                    changed = true;

                    i = Math.max(-1, i - 2);
                }
            }
        } while (changed);

        return !line.isEmpty();  // true = тамақтанады
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DragonLaunch dragon = new DragonLaunch();

        System.out.print("Enter people sequence (B/G): ");
        String people = input.nextLine();

        for (char c : people.toCharArray()) {
            if (c == 'B' || c == 'b') {
                dragon.kidnap(new Person(Gender.BOY));
            } else if (c == 'G' || c == 'g') {
                dragon.kidnap(new Person(Gender.GIRL));
            }
        }

        System.out.print("Sequence: ");
        for (Person p : dragon.kidnapped) {
            System.out.print(p.isBoy() ? "B" : "G");
        }
        System.out.println();

        if (dragon.willDragonEatOrNot()) {
            System.out.println("The dragon eats! (Students remain)");
        } else {
            System.out.println("No one is eaten! (All vanished)");
        }

        input.close();
    }
}