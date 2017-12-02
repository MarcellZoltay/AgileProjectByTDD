import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tesztesetek a TimeToMs osztályhoz
 */
public class TimeToMsTest {

    @Test
    public void testOneHourToMs(){
        int hours = 1;
        int is = TimeToMs.hours(hours);
        int shouldBe = 1 * 60 * 60 *1000;
        Assertions.assertEquals(shouldBe, is, "1 hour should be 3,600,000ms.");
    }

    @Test
    public void test15HoursToMs(){
        int hours = 15;
        int is = TimeToMs.hours(hours);
        int shouldBe = 15 * 60 * 60 * 1000;
        Assertions.assertEquals(shouldBe, is, "15 hours should be 54,000,000ms.");
    }

    @Test
    public void testZeroHoursToMs(){
        int hours = 0;
        int is = TimeToMs.hours(hours);
        int shouldBe = 0;
        Assertions.assertEquals(shouldBe, is, "0 hours should be 0ms.");
    }

    @Test
    public void testNegativeHoursToMs(){
        int hours = -5;
        Assertions.assertThrows(IllegalArgumentException.class, () -> TimeToMs.hours(hours), "Exception should be thrown for -5 hours." );
    }

    @Test
    public void testIntMaxHoursToMs() {
        int hours = Integer.MAX_VALUE;
        Assertions.assertThrows(ArithmeticException.class, () -> TimeToMs.hours(hours), "Exception should be thrown for Integer.MAX_VALUE hours." );
    }

    @Test
    public void testOneMinuteToMs(){
        int minutes = 1;
        int is = TimeToMs.minutes(minutes);
        int shouldBe = 1 * 60 *1000;
        Assertions.assertEquals(shouldBe, is, "1 hour should be 3,600,000ms.");
    }

    @Test
    public void test15MinutesToMs(){
        int minutes = 15;
        int is = TimeToMs.minutes(minutes);
        int shouldBe = 15 * 60 * 1000;
        Assertions.assertEquals(shouldBe, is, "15 minutes should be 900,000ms.");
    }

    @Test
    public void testZeroMinutesToMs(){
        int minutes = 0;
        int is = TimeToMs.minutes(minutes);
        int shouldBe = 0;
        Assertions.assertEquals(shouldBe, is, "0 minutes should be 0ms.");
    }

    @Test
    public void testNegativeMinutesToMs(){
        int minutes = -5;
        Assertions.assertThrows(IllegalArgumentException.class, () -> TimeToMs.minutes(minutes), "Exception should be thrown for -5 minutes." );
    }

    @Test
    public void testIntMaxMinutesToMs() {
        int minutes = Integer.MAX_VALUE;
        Assertions.assertThrows(ArithmeticException.class, () -> TimeToMs.minutes(minutes), "Exception should be thrown for Integer.MAX_VALUE minutes." );
    }
}
