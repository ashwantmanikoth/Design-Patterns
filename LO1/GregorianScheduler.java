package LO1;

import java.util.Date;

public class GregorianScheduler implements Scheduler{
    @Override
    public void schedule(Event event) {
        Calendar calendar = new GregorianCalendar();
        calendar.addEvent(new Event(),new Date());
    }
}
