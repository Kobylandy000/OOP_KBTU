package lab3.task3;

public class Task3Demo {
    public static void main(String[] args) {
        System.out.println("=== Task 3: MyCollection ===");
        MyCollection<String> list = new MyArrayList<>();
        list.add("Алма");
        list.add("Бекзат");
        list.add("Сания");
        System.out.println("Collection: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Contains 'Бекзат': " + list.contains("Бекзат"));

        list.remove("Бекзат");
        System.out.println("After remove: " + list);

        System.out.print("Iterator: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        MyCollection<String> other = new MyArrayList<>();
        other.add("Дана");
        other.add("Ержан");
        list.addAll(other);
        System.out.println("After addAll: " + list);
    }
}
