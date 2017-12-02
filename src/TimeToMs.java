public class TimeToMs {
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
