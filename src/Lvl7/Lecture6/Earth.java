package Lvl7.Lecture6;

/*
 * Как известно, на планете Земля есть 6 материков. Создай для каждого материка собственный класс. В каждом классе должно быть поле,
 * которое хранит площадь соответствующего материка.
 * Площадь материка нужно указывать при его создании, и она должна быть неизменяемой.
 * Ты можешь использовать любые числа для задания площади материков.
 */

public class Earth {
    public static void main(String[] args) {
        Africa africa = new Africa(1);
        Antarctica antarctica = new Antarctica(2);
        Australia australia = new Australia(3);
        Eurasia eurasia = new Eurasia(4);
        NorthAmerica northAmerica = new NorthAmerica(5);
        SouthAmerica southAmerica = new SouthAmerica(6);
    }
}

class Africa {
    private final int area;
    
    public Africa(int area) {
        this.area = area;
    }
}

class Antarctica {
    private final int area;
    
    public Antarctica(int area) {
        this.area = area;
    }
}

class Australia {
    private final int area;
    
    public Australia(int area) {
        this.area = area;
    }
}

class Eurasia {
    private final int area;
    
    public Eurasia(int area) {
        this.area = area;
    }
}

class NorthAmerica {
    private final int area;
    
    public NorthAmerica(int area) {
        this.area = area;
    }
}

class SouthAmerica {
    private final int area;
    
    public SouthAmerica(int area) {
        this.area = area;
    }
}