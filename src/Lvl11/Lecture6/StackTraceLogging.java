package Lvl11.Lecture6;

/*
 * В методе main перехвати исключение и выведи его стектрейс.
 */

public class StackTraceLogging {
    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {

        }
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
