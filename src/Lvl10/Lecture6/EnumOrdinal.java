package Lvl10.Lecture6;

/*
 * В enum JavarushQuest хранится список квестов. Твоя задача — получить массив всех элементов в методе main (используй метод values())
 * и вывести порядковый номер каждого из них (используй метод ordinal()) с новой строки.
 */

public class EnumOrdinal {
    public static void main(String[] args) {
        JavarushQuest[] quests = JavarushQuest.values();
    
        for (JavarushQuest quest : quests) {
            System.out.println(quest.ordinal());
        }
    }
}

enum JavarushQuest {
    JAVA_SYNTAX,
    JAVA_CORE,
    JAVA_MULTITHREADING,
    JAVA_COLLECTIONS,
    CS_50,
    ANDROID,
    GAMES
}