/* Cтворити клас Friends.
 За допомогою методів ArrayList додати масив імена друзів.
 Вивести список друзів,
 після вивести список друзів, відсортувавши в алфавітному порядку.
 */


import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Joey");
        names.add("Rachel");
        names.add("Monika");
        names.add("Ross");
        names.add("Chandler");
        names.add("Phoebe");
        System.out.println("Список друзів: " + names);
        Collections.sort(names);
        System.out.println("Список друзів в алфавітному порядку: " + names);

    }
}
