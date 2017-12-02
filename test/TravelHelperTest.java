import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * TravelHelper osztály tesztelése
 */
public class TravelHelperTest {

    @Test
    public void testGetTravelHoursZeroDistance(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> TravelHelper.getTravelHours(0, 1));
    }
    @Test
    public void testGetTravelHoursZeroSpeed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> TravelHelper.getTravelHours(1, 0));
    }
    @Test
    void testGetTravelHoursNegativeDistance(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> TravelHelper.getTravelHours(-1, 1));
    }
    @Test
    void testGetTravelHoursNegativeSpeed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> TravelHelper.getTravelHours(1, -1));
    }
    @Test
    public void testGetTravelHoursTenDistanceFiveSpeed(){
        double hours = TravelHelper.getTravelHours(10, 5);
        Assertions.assertEquals(2, hours, "Should be 2 hours");
    }


    @Test
    public void testGetTravelMinutesZeroDistance(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> TravelHelper.getTravelMinutes(0, 1));
    }
    @Test
    public void testGetTravelMinutesZeroSpeed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> TravelHelper.getTravelMinutes(1, 0));
    }
    @Test
    public void testGetTravelMinutesNegativeDistance(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> TravelHelper.getTravelMinutes(-1, 1));
    }
    @Test
    public void testGetTravelMinutesNegativeSpeed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> TravelHelper.getTravelMinutes(1, -1));
    }
    @Test
    public void testGetTravelMinutesTenDistanceOneSpeed(){
        int mins = TravelHelper.getTravelMinutes(10, 1);
        Assertions.assertEquals(600, mins, "Should be 600 minutes");
    }

    @Test
    public void testGetTravelHoursByLocationsZeroSpeed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> TravelHelper.getTravelHours(new Location(), new Location(), 0));
    }
    @Test
    public void testGetTravelHoursByLocationsNegativeSpeed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> TravelHelper.getTravelHours(new Location(), new Location(), -1));
    }
    @Test
    public void testGetTravelMinutesByLocationsZeroSpeed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> TravelHelper.getTravelMinutes(new Location(), new Location(), 0));
    }
    @Test
    public void testGetTravelMinutesByLocationsNegativeSpeed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> TravelHelper.getTravelMinutes(new Location(), new Location(), -1));
    }
}
