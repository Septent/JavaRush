package Lvl19.Lecture4;

/*
 * Исправь код так, чтобы программа выполнялась и выводила фразу: "Я переводчик с английского".
 * Метод main менять нельзя!
 */

public class TranslatorTwo {
    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static class Translator {
        public String translate() {
            return "Я переводчик с английского";
        }
    }
}
