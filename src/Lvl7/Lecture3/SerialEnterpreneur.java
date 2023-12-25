package Lvl7.Lecture3;

/*
 * Постройка здания планировалась под ресторан и успешно завершилась, но спустя некоторое время собственники решили
 * переделать его под барбершоп. Нам нужно сделать так, что бы здание было универсальным, и его назначение можно
 * было менять, не создавая нового.
 * 
 * Для этого создай метод initialize, который будет устанавливать значение полю type (определять тип здания), а
 * конструктор убери.
 */

public class SerialEnterpreneur {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        SerialEnterpreneur building = new SerialEnterpreneur();
        building.initialize("Барбершоп");
    }
}
