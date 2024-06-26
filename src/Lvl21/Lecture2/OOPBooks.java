package Lvl21.Lecture2;

import java.util.LinkedList;
import java.util.List;

/*
 * Давай напишем программу, которая будет определять жанр книги, или автора, который ее написал.
 * Для этого:
 * 1. Создай public static класс MarkTwainBook, который наследуется от Book. Имя автора — [Mark Twain].
 *       Параметр конструктора — название книги (title).
 * 2. В классе MarkTwainBook реализуй все абстрактные методы.
 * 3. Для метода getBook измени тип возвращаемого значения на более подходящий.
 * 4. Создай по аналогии AgathaChristieBook. Имя автора — [Agatha Christie].
 * 5. В классе Book реализуй тело метода getOutputByBookType() так, чтобы он возвращал:
 *      agathaChristieOutput — для книг Агаты Кристи;
 *      markTwainOutput — для книг Марка Твена.
 */

public class OOPBooks {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            
            
            if (this instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
            } else if (this instanceof MarkTwainBook) {
                output = markTwainOutput;
            }

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {
        private String title;

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        public MarkTwainBook getBook() {
            return this;
        }

        public String getTitle() {
            return this.title;
        }
    }

    public static class AgathaChristieBook extends Book {
        private String title;

        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        public AgathaChristieBook getBook() {
            return this;
        }

        public String getTitle() {
            return this.title;
        }
    }
}
