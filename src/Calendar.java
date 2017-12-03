import java.util.ArrayList;
import java.util.Date;

public class Calendar {

    private ArrayList<Event> events = new ArrayList<>();
    private ArrayList<Notification> notifications = new ArrayList<Notification>();

    public int getEventsCount() {
        return events.size();
    }

    public int getNotificationsCount() {
        return notifications.size();
    }

    public void registerNotification(Notification n) {
        notifications.add(n);
    }

    public void addEvent(Event e) {
        events.add(e);
    }

    public void tick(Date date) {

    }

}
