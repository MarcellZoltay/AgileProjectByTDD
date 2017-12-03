import java.util.Date;

public class Event {

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public Location getLocation() {
        return location;
    }

    private int priority;
    private String name;
    private Date start;
    private Date end;
    private Location location;

    //private ArrayList<Notification> notifications = new ArrayList<>();

    public Event(Date start, Date end, String name, Location location, int priority) {
        this(start, end, name, location);
        setPriority(priority);
    }

    public Event(Date start, Date end, String name, Location location) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.location = location;
    }

    public Event(Date start, String name, Location location) {
        this.name = name;
        this.start = start;
        this.end = new Date(start.getTime() + TimeToMs.hours(1));
        this.location = location;
    }

    private void setPriority(int priority) {
        if (priority > 5)
            this.priority = 5;
        else if (priority < 1)
            this.priority = 1;
        else
            this.priority = priority;
    }

    @Override
    public String toString() {
        return this.name + " at " + start.toString();
    }
}
