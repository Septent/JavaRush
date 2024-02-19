package Lvl14.Lecture6;

/*
 * Класс Person объявлен как абстрактный. Это значит, что мы не можем создавать его экземпляры.
 * Сделай из данного класса обычный, допиши недостающую логику, которая отвечает общепринятым подходам к инкапсуляции:
 * геттеры должны возвращать, а сеттеры — устанавливать значения соответствующим полям.
 */

public class FromAbstractionToReality {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
