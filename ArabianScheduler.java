import java.util.Date;

public class ArabianScheduler implements Scheduler{
    public void schedule(Event event) {
        Calendar calendar = new ArabianCalendar();
        calendar.addEvent(new Event(),new Date());
    }
}
