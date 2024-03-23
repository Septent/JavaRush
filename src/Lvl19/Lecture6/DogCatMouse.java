package Lvl19.Lecture6;

/*
 * Создай классы Dog, Cat и Mouse.
 * Реализуй интерфейсы в добавленных классах, учитывая что:
 * 
 * Кот (Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
 * Мышь (Mouse) может передвигаться, и ее могут съесть;
 * Собака (Dog) может передвигаться и съесть кого-то.
 */

public class DogCatMouse {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }
    
    public class Dog implements Movable, Eat {
        public void eat() {

        }

        public void move() {

        }
    }
    
    public class Cat implements Movable, Edible, Eat {
        public void eat() {

        }

        public void move() {
            
        }

        public void beEaten() {

        }
    }
    
    public class Mouse implements Movable, Edible {
        public void move() {
            
        }

        public void beEaten() {

        }
    }
}
