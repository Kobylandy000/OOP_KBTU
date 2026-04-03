package lab3.task3;

import java.util.Iterator;

/**
 * TASK 3: MyCollection — максималды жалпы (abstract) коллекция интерфейсі
 * Java-дың Collection интерфейсіне ұқсас, бірақ біздің нұсқамыз
 */

public interface MyCollection<E> extends Iterable<E> {  // Iterable қосылды
    boolean add(E element);
    boolean remove(Object o);
    boolean contains(Object o);
    int size();
    boolean isEmpty();
    void clear();
    Object[] toArray();
    boolean addAll(MyCollection<? extends E> other);
    boolean removeAll(MyCollection<?> other);
    Iterator<E> iterator(); // Iterable-дан да келеді
}
//public interface MyCollection<E> extends Iterable<E>{
//
//    // Негізгі операциялар
//    boolean add(E element);
//
//    boolean remove(Object o);
//
//    boolean contains(Object o);
//
//    // Өлшем
//    int size();
//
//    boolean isEmpty();
//
//    // Барлығын тазалау
//    void clear();
//
//    // Массивке айналдыру
//    Object[] toArray();
//
//    // Бірнеше элемент қосу
//    boolean addAll(MyCollection<? extends E> other);
//
//    // Бірнеше элемент жою
//    boolean removeAll(MyCollection<?> other);
//
//    // Итератор — элементтер арқылы өту үшін
//    Iterator<E> iterator();
//}
