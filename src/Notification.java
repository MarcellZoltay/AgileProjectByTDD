import java.util.Date;

/**
 * Egy értesítés adatai: mikor, miről, hogyan értesít, és melyik eventhez tartozik
 * Ha elsütik, kiírja az adatait
 */

public class Notification {

    /**
     * A notification tulajdonosa
     */
    Event ownerEvent;

    /**
     * Az értesítés ideje
     */
    Date notificationTime;

    public Notification(Date date) {
        notificationTime = date;
    }

    /**
     * Megadja, melyik eseményhez tartozik a notification
     * @return Esemény, amelyhez tartozik a notification
     */

    public Event getOwnerEvent() {
        return ownerEvent;
    }

    /**
     * Beállítja, melyik eseményhez tartozik a notification
     * @param e Esemény, amihez a notification tartozik
     */
    public void setEvent(Event e) {
        ownerEvent = e;
    }

    /**
     * Visszaadja az értesítés idejét
     * @return Az értesítés ideje
     */
    public Date getNotificationTime() {return notificationTime;}

    /**
     * Az értesítés "végrehajtása" - egyelőre kiírok vmit a konzolra
     */
    public void execute() { System.out.println(this.toString()); }

    @Override
    public String toString() {return "Notification at " + notificationTime.toString() + ", for " + ownerEvent.toString(); }

}