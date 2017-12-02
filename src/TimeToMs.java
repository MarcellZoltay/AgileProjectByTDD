/**
 * Miliszekundumokká alakítja a megadott időt,
 * kód szempontjából olvasható formában, pl.
 * 1 * 60 * 60 * 1000 helyett írhatom, hogy
 * TimeToMs.hours(1);
 */
public class TimeToMs {

    /**
     * A megadott órát átalakítja ms-má
     * @param hours Óra, amire szükség van ms-ban
     * @return A megadott óra ms-ban
     */
    public static int hours(int hours) {
        if (hours >= 0) {
            int result = hours * 60 * 60 * 1000;
            if (result < hours)
                throw new ArithmeticException("Integer overflow.");
            return result;
        }
        else
            throw new IllegalArgumentException("Negative hours are invalid");
    }

    /**
     * A megadott percet átalakítja ms-má
     * @param minutes Perc, amire szükség van ms-ben
     * @return A megadott perc ms-ban
     */
    public static int minutes(int minutes) {
        if (minutes >= 0) {
            int result =  minutes * 60 * 1000;
            if (result < minutes)
                throw new ArithmeticException("Integer overflow.");
            return result;
        }
        else
            throw new IllegalArgumentException("Negative minutes are invalid");
    }
}
