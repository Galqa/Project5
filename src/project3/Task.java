/**
 * Cтворити проект, пакет.
 * Створити клас Main, створити список цілих чисел
 * і за допомогою ListIterator пройтись по списку і збільшити значення на 1.
 */


package project3;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Список цілих чисел: " + numbers);
        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            iterator.set(number + 1);
        }
        System.out.println("Список цілих чисел після збільшення на 1: " + numbers);
    }
}
