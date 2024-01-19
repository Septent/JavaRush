package Lvl10.Lecture4;

import java.util.HashMap;

/*
 * В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение - его средняя оценка.
 * Твоя задача — реализовать метод addStudents, который добавит 5 студентов с их средней оценкой в коллекцию grades.
 * Значения можешь выбрать любые.
 */

public class StudentPerformance {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Peter", 5.0);
        grades.put("Ivan", 5.0);
        grades.put("Igor", 4.8);
        grades.put("Mark", 4.5);
        grades.put("Fedor", 3.3);
    }
}
