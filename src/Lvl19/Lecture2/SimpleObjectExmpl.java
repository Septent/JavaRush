package Lvl19.Lecture2;

/*
 * В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
 */

public class SimpleObjectExmpl {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> {
        public SimpleObject<String> getInstance() {
            return new StringObject();
        }
    }
}
