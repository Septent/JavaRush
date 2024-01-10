package Lvl8.Lecture6;

/*
 * Метод main класса Solution создает объект класса Student с конкретным именем, но программа не компилируется.
 * Тебе нужно исправить ошибку в классе Student, чтобы программа компилировалась, и при запуске в консоль выводилось имя студента.
 */

public class StudentConstruct {
    public static void main(String[] args) {
        Student student = new Student("Амиго");
        System.out.println(student.name);
    }
}

class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }
}
