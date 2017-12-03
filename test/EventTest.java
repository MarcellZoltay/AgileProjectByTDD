import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Calendar;

public class EventTest {

    Calendar start;
    Calendar finish;
    Location loc;

    @BeforeEach
    public void prepare(){
        start = Calendar.getInstance();
        finish = Calendar.getInstance();

        loc = new Location("BME IQ", 47.472850, 19.059123);

        start.set(2017, Calendar.DECEMBER, 6, 12, 15);
        finish.set(2017, Calendar.DECEMBER, 6, 14, 0);
    }

    @Test
    public void testInit() {
        Event event = new Event(start.getTime(), finish.getTime(), "Agilis óra", loc, 3);
        Assertions.assertEquals(3, event.getPriority(), "Priority should be 3.");
        Assertions.assertEquals("Agilis óra", event.getName(), "Name should be Agilis óra.");
        Assertions.assertEquals(start.getTime(), event.getStart(), "Start should be 2017. 12. 6. 12:15");
        Assertions.assertEquals(finish.getTime(), event.getEnd(), "Start should be 2017. 12. 6. 14:00");
        Assertions.assertEquals(loc, event.getLocation(), "Location should be BME IQ.");
    }

    @Test
    public void testPrioritySetting() {
        /*Location petofi = new Location("Petőfi híd budai hídfő", 47.477103, 19.059922);
        Location corvin = new Location("Corvin negyed", 47.485722, 19.069985);*/
        Event event = new Event(start.getTime(), finish.getTime(), "Agilis óra", loc, 2);
        Assertions.assertEquals(2, event.getPriority(), "Priority should be 2.");
    }

    @Test
    public void testTooLowPriority() {
        Event event = new Event(start.getTime(), finish.getTime(), "Agilis óra", loc, -1);
        Assertions.assertEquals(1, event.getPriority(), "Priority should be 1.");
    }

    @Test
    public void testTooHighPriority() {
        Event event = new Event(start.getTime(), finish.getTime(), "Agilis óra", loc, 6);
        Assertions.assertEquals(5, event.getPriority(), "Priority should be 5.");
    }
}
