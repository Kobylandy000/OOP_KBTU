package lab3.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 3-тапсырманы тексеру ===\n");

        // MyCollection интерфейсін қолдану
        MyCollection<String> names = new MyArrayList<>();

        // 1. add() тексеру
        System.out.println("1. add() тексеру:");
        names.add("Асан");
        names.add("Үсен");
        names.add("Марат");
        System.out.println("   Қосылды: Асан, Үсен, Марат\n");

        // 2. size() тексеру
        System.out.println("2. size() тексеру:");
        System.out.println("   Өлшем: " + names.size() + " (күтілетін: 3)\n");

        // 3. contains() тексеру
        System.out.println("3. contains() тексеру:");
        System.out.println("   'Асан' бар ма? " + names.contains("Асан"));
        System.out.println("   'Болат' бар ма? " + names.contains("Болат") + "\n");

        // 4. isEmpty() тексеру
        System.out.println("4. isEmpty() тексеру:");
        System.out.println("   Бос па? " + names.isEmpty() + "\n");

        // 5. iterator() тексеру
        System.out.println("5. iterator() тексеру:");
        System.out.print("   Элементтер: ");
        MyIterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\n");

        // 6. remove() тексеру
        System.out.println("6. remove() тексеру:");
        names.remove("Үсен");
        System.out.println("   'Үсен' өшірілді");
        System.out.print("   Қалған элементтер: ");
        it = names.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\n");

        // 7. clear() тексеру
        System.out.println("7. clear() тексеру:");
        names.clear();
        System.out.println("   Барлығы тазаланды");
        System.out.println("   size: " + names.size());
        System.out.println("   isEmpty: " + names.isEmpty());
    }
}
