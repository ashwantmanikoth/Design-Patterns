import java.util.Date;

public class Scheduler {
    private Calendar calendar = null;

    Scheduler(int type) {
        if (calendar == null) {
            if (type == 1) {
                calendar = new GregorianCalendar();
            } else {
                calendar = new ArabianCalendar();
            }
        }
    }

    public void schedule(Event event) {
        var today = new Date();
        calendar.addEvent(event, today);
    }
}
