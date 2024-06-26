package Lvl20.Lecture8;

import java.util.LinkedList;
import java.util.List;

/*
 * У нас есть программа, которая должна заполнять список и выводить его определенным образом в консоли.
 * Сейчас она работает некорректно. Чтобы исправить программу:
 * 1. Подумай что делает метод main().
 * 2. Создай в классе Solution статические методы initList(List<Number> list), printListValues(List<Number> list), processCastedObjects(List<Number> list).
 * 3. Найди блок кода, который заполняет значениями список, и перемести его в метод initList.
 * 4. Найди блок кода, который в цикле for выводит на экран содержимое списка, и перемести его в метод printListValues.
 * 5. Найди блок кода, в котором для каждого объекта списка проверяется тип и выводятся сообщения на экран, и перемести его в метод processCastedObjects.
 * 6. Исправь 2 ошибки в методе printListValues так, чтобы на экран корректно выводилось содержимое переданного в качестве параметра списка.
 * 7. Исправь 2 ошибки в методе processCastedObjects, связанные с приведением типов:
 *      для объекта типа Float нужно вывести "Is float value defined? " + !([Float_object].isNaN()).
 *      для объекта типа Double нужно вывести "Is double value infinite? " + [Double_object].isInfinite().
 * 8. Метод main() не учавствует в проверке, но для отображения результата можно вызвать все новые методы и передать каждому список list.
 */

public class CorrectFourMistakes {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
        initList(list);

        printListValues(list);

        processCastedObjects(list);
    }

    static void initList(List<Number> list) {
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
    }

    static void printListValues(List<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static void processCastedObjects(List<Number> list) {
        for (Number object : list) {
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }
}
