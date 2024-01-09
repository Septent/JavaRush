package Lvl8.Lecture3;

/*
 * В классе Window есть метод changeSize, который должен менять размеры окна на значения, переданные в метод.
 * Но если ты запустишь программу, то убедишься, что этот метод не работает. Тебе нужно исправить ошибки так, чтобы метод заработал.
 */

public class WindowWorks {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}

class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void printSize(){
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }
}