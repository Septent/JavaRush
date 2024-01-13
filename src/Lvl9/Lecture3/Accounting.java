package Lvl9.Lecture3;

import java.util.ArrayList;

/*
 * В классе Solution есть список сотрудников waitingEmployees, которые ждут зарплату, и список сотрудников alreadyGotSalaryEmployees,
 * которые её уже получили. Необходимо реализовать метод paySalary(String), который в качестве аргумента принимает имя сотрудника,
 * желающего получить зарплату.
 * Метод должен проверить наличие сотрудника в списке waitingEmployees, и если он не получал зарплату, выдать её:
 * 1. Если параметр метода paySalary(String) равняется null, ничего не нужно делать.
 * 2. Добавить имя сотрудника в список alreadyGotSalaryEmployees.
 * 3. В списке waitingEmployees заменить имя сотрудника на null.
 */

public class Accounting {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (name == null) return;

        if (waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
        }
    }
}
