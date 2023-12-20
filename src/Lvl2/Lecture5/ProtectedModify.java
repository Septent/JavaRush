package Lvl2.Lecture5;

/*
 * Перед тобой программа, которая выводит информацию о человеке в консоли. К сожалению, она не компилируется.
 * Измени минимальное необходимое количество модификаторов доступа в классе Person, чтобы код скомпилировался.
 */

public class ProtectedModify {
    public static void main(String[] args) {
        Person person = new Person("Иван", "Иванов");
        System.out.println("Досье.");
        System.out.println("Имя: " + person.getFirstName());
        System.out.println("Фамилия: " + person.getLastName());
        System.out.println("Полное имя: " + person.getFullName());
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getFullName(){
        return firstName + " " + lastName;
    }
}
