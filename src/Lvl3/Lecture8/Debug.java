package Lvl3.Lecture8;

/*
 * Потренируйся определять и изменять значения переменных во время выполнения программы:
 * 1. Поставь break point напротив вызова метода println и запусти программу в режиме отладки.
 * 2. После остановки нажми F8 ровно 9 раз.
 * 3. Посмотри, какое значение сейчас у переменной correction и установи такое же значение переменной fahrenheit (в окне отладки).
 * 4. Нажми F8 еще 6 раз.
 * 5. Посмотри текущее значение переменной correction и присвой это значение полю result (измени исходный код).
 * В итоге в классе Solution должно быть только одно изменение: поле result должно быть инициализировано при объявлении.
 */

public class Debug {
    public static int result = 105;

    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            System.out.println(correction);
        }
    }
}
