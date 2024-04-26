package Lvl21.Lecture12;

/*
 * Чтобы решить эту задачу:
 * Создай 4 конструктора с разными модификаторами доступа в классе Solution.
 * В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
 * Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
 * Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 разных (все, кроме private).
 */

public class OverloadConstructExample {
    public static void main(String[] args) {

    }

    public OverloadConstructExample() {

    }

    private OverloadConstructExample(int i) {

    }

    protected OverloadConstructExample(double d) {

    }

    OverloadConstructExample(String s) {

    }
}

class OverloadContrExSub extends OverloadConstructExample {
    public OverloadContrExSub() {

    }

    protected OverloadContrExSub(double d) {
        super(d);
    }

    OverloadContrExSub(String s) {
        super(s);
    }
}
