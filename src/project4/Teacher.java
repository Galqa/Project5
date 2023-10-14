/**
 * Cтворити проект, пакет.
 * Створити class Main()Teacher, у ньому створити список, додати вчителів, яких ви зможете згадати зі школи.
 * І отримати індекс найкращого вчителя та самого не дуже. Вивести список у консоль.
 */


package project4;

import java.util.ArrayList;


public class Teacher {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add(0, "Майстер Йода");
        teachers.add(1, "Обі-Ван Кенобі");
        teachers.add(2, "Дарт Вейдер");

        System.out.println("Список вчителів: " + teachers);

        int bestTeacherIndex = 0;
        int notSoGoodTeacherIndex = 2;

        System.out.println("Індекс найкращого вчителя: " + bestTeacherIndex);
        System.out.println("Індекс вчителя самого не дуже: " + notSoGoodTeacherIndex);
    }
}
