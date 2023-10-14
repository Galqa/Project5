/* Cтворити проект, пакет.
 Використовуючи клас Zoo, видалити 3, 5, 7 тварин,
 дізнатися розмір списку і вивести в консоль.
 */


package project2;

import java.util.ArrayList;

public class Zoo1 {
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
        System.out.println("Список із восьми тварин: " + animals);
        // використовуємо метод видалення
           animals.remove(3);
           animals.remove(4); // після видалення індекси зміщаються
           animals.remove(5);
        System.out.println("Список тварин післі видалення: " + animals);
        System.out.println("Розмір списку: " + animals.size());
    }
}
