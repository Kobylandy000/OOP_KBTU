package lab3.task3;

public class MyArrayList<E> implements MyCollection<E> {

    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public boolean add(E element) {
        if (size == elements.length) {
            // Кеңейту
            Object[] newArray = new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
        elements[size++] = element;
        return true;
    }

    @Override
    public boolean remove(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public MyIterator<E> iterator() {
        return new MyIterator<E>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            @SuppressWarnings("unchecked")
            public E next() {
                return (E) elements[currentIndex++];
            }
        };
    }

}
