package Lvl14.Lecture7;

/*
 * Настоящий артист должен уметь развлечь людей. И танцы, и пение — это часть развлечения.
 * Перед тобой 3 интерфейса:
 * Dance — танцующий,
 * Sing — поющий,
 * Artist — артист.
 * 
 * Продумай, какая структура наследования подойдет этим интерфейсам. Унаследуй один интерфейс от двух других.
 */

public class LetTheShowBegin {
    
}

interface Sing {

}

interface Dance {

}

interface Artist extends Sing, Dance {

}