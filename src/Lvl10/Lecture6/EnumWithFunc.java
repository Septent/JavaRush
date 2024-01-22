package Lvl10.Lecture6;

/*
 * В enum Month добавь 4 метода: getWinterMonths(), getSpringMonths(), getSummerMonths(), getAutumnMonths() которые будут возвращать массив
 * с тремя месяцами.
 */

public class EnumWithFunc {
    public static void main(String[] args) {
        
    }

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    
        public static Month[] getWinterMonths() {
            Month[] winterMonth = {JANUARY, FEBRUARY, DECEMBER};
            return winterMonth;
        }

        public static Month[] getSpringMonths() {
            Month[] springMonth = {MARCH, APRIL, MAY};
            return springMonth;
        }

        public static Month[] getSummerMonths() {
            Month[] summerMonth = {JUNE, JULY, AUGUST};
            return summerMonth;
        }

        public static Month[] getAutumnMonths() {
            Month[] autumnMonth = {SEPTEMBER, OCTOBER, NOVEMBER};
            return autumnMonth;
        }
    }
}
