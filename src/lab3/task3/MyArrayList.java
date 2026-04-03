package lab3.task3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * MyArrayList — MyCollection интерфейсінің іске асырылуы
 * Элементтерді динамикалық массивте сақтайды
 */
public class MyArrayList<E> implements MyCollection<E> {
    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public boolean add(E element) {
        ensureCapacity();
        data[size++] = element;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                System.arraycopy(data, i + 1, data, i, size - i - 1);
                data[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public int size() { return size; }

    @Override
    public boolean isEmpty() { return size == 0; }

    @Override
    public void clear() {
        Arrays.fill(data, 0, size, null);
        size = 0;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(data, size);
    }

    @Override
    public boolean addAll(MyCollection<? extends E> other) {
        boolean changed = false;
        for (Object e : other.toArray()) {
            add((E) e);
            changed = true;
        }
        return changed;
    }

    @Override
    public boolean removeAll(MyCollection<?> other) {
        boolean changed = false;
        for (Object e : other.toArray()) {
            if (remove(e)) changed = true;
        }
        return changed;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int cursor = 0;

            @Override
            public boolean hasNext() { return cursor < size; }

            @Override
            public E next() {
                if (!hasNext()) throw new NoSuchElementException();
                return (E) data[cursor++];
            }
        };
    }

    private void ensureCapacity() {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) sb.append(", ");
        }
        return sb.append("]").toString();
    }
}
