package Lvl20.Lecture4;

/*
 * В этой задаче тебе нужно:
 * Правильно расставить наследование между Building (здание) и School (здание школы).
 * Подумать, объект какого класса должны возвращать методы getSchool и getBuilding.
 * Изменить null на объект класса Building или School.
 * Сигнатуры методов getSchool() и getBuilding() не меняй.
 */

public class BuildingAndSchool {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        School school = new School();
        //измените null на объект класса Building или School
        return (Building) school;
    }

    public static Building getBuilding() {
        //измените null на объект класса Building или School
        return new Building();
    }

    static class School extends Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
