/** Cтворити проект, пакет.
 *  Створити клас Zoo.
 *  У класі створити список, який записати 8 тварин через метод add(index, element).
 *  Вивести список у консоль.
 */

package project1;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0, "Tiger");
        animals.add(1, "Horse");
        animals.add(2, "Cat");
        animals.add(3, "Fox");
        animals.add(4, "Lion");
        animals.add(5, "Dog");
        animals.add(6, "Rabbit");
        animals.add(7, "Elephant");
        System.out.println(animals);
    }

}
