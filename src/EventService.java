import java.util.Date;

public class EventService {

    public static final int defaultNotificationCount = 1;
    public static final int defaultNotificationFrequency = TimeToMs.minutes(30);
    public static final int defaultNotificationStart = TimeToMs.minutes(30);
    public static final int basePriority = 1;

    private int notificationCount = defaultNotificationCount;
    private int notificationFrequency = defaultNotificationFrequency;
    private int notificationStart = defaultNotificationStart;

    public void generateNotifications(Event forEvent, Location startFrom, int speed) {

        double estimatedTripTime = TravelHelper.getTravelMinutes(startFrom, forEvent.getLocation(), speed);
        double tripTime = estimatedTripTime * getWeight(forEvent.getPriority());
        double preparationTime = notificationStart * getWeight(forEvent.getPriority());

        double notificationTimeSpan = notificationStart / (forEvent.getPriority() + 1);
        double time = forEvent.getStart().getTime() - tripTime - preparationTime;

        for (int i = 0; i < notificationCount; ++i) {
            Notification n = new Notification(new Date((long)time));
            n.setEvent(forEvent);
            //notifications.add(n); //kell ez??

            //nem volt Calendar, úgyhogy kikommenteztem
            //Calendar.getInstance().registerNotification(n);

            time += notificationTimeSpan;
        }
    }

    private double getWeight(int priority) {
        return basePriority + (priority - 1) * 0.5;
    }
}
