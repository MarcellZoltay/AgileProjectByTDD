import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TestNotification {

    private Notification n;
    private Date d;
    private Event e;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        Event e = new Event();
        Date d = new Date();
        n = new Notification(d);
        n.setEvent(e);

    }

    @Test
    public void testGetOwnerEventReturnsNotNull() {
        Event ee = n.getOwnerEvent();
        assertNotNull(ee, "Should not be null");
    }

    @Test
    public void testGetNotificationTimeNotNull() {
        Date d = n.getNotificationTime();
        assertNotNull(d, "Should not be null");
    }

    @Test
    public void testExecutePrintsCorrectly() {
        System.setOut(new PrintStream(outContent)); // a System.out.write tesztelésére

        d = new Date();
        n = new Notification(d);
        e = new Event();
        n.setEvent(e);

        n.execute();
        assertEquals("Notification at " +
                d.toString() + ", for " +
                e.toString() + "\r\n",
                outContent.toString());
    }

    @Test
    public void testToStringNotNull() {
        String s = n.toString();
        assertNotNull(s);
    }

    @Test
    public void testToStringPrintsCorrectly() {
        System.setOut(new PrintStream(outContent)); // a System.out.write tesztelésére

        d = new Date();
        n = new Notification(d);
        e = new Event();
        n.setEvent(e);

        System.out.println(n.toString());
        assertEquals("Notification at " +
                        d.toString() + ", for " +
                        e.toString() + "\r\n",
                outContent.toString());
    }
}