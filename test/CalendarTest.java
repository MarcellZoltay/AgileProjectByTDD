import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    private Calendar c;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        c = new Calendar();
    }

    @Test
    public void testGetEventsCount() {
        int i = c.getEventsCount();
        assertEquals(0, i, "Should be zero");
    }

    @Test
    public void testAddEvent() {
        c.addEvent(new Event());
        int size = c.getEventsCount();
        assertEquals(1, size, "Should be 1 now");
    }

    public void testAddEventWith5Events() {
        for (int i=0; i<5; i++) {
            c.addEvent(new Event());
        }
        int size = c.getEventsCount();
        assertEquals(5, size, "Should be 5");

    }

    @Test
    public void testNotificationsCountWithEmptyList() {
        int n = c.getNotificationsCount();
        assertEquals(0, n, "Should be zero");
    }

    @Test
    public void testRegisterNotification() {
        Notification n = new Notification(new Date());
        c.registerNotification(n);
        int num = c.getNotificationsCount();
        assertEquals(1, num, "Should be 1");
    }



    @Test
    public void testTickWithOneDate() {

    }




}