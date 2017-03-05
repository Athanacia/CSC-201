package Exercise10_1;

/**
 * Created by Gabriel on 2/26/2017.
 */
public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        long Totalsecond = System.currentTimeMillis() / 1000;
        long currentSecond = Totalsecond % 60;
        this.second = currentSecond;
        long Totalminutes = Totalsecond / 60;
        long currentMinutes = Totalminutes % 60;
        this.minute = currentMinutes;
        long Totalhour = Totalminutes / 60;
        long currentHour = Totalhour % 24;
        this.hour = currentHour;
    }

    public Time(long ElapseTime) {
        long Totalsecond = ElapseTime / 1000;
        long CurrentSecond = Totalsecond % 60;
        this.second = CurrentSecond;
        long TotalMinute = Totalsecond / 60;
        long CurrentMinute = TotalMinute % 60;
        this.minute = CurrentMinute;
        long TotalHour = TotalMinute / 60;
        long CurrentHour = TotalHour % 24;
        this.hour = CurrentHour;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setElapseTime(long ElapseTime) {
        long Totalsecond = ElapseTime / 1000;
        long CurrentSecond = Totalsecond % 60;
        this.second = CurrentSecond;
        long TotalMinute = Totalsecond / 60;
        long CurrentMinute = TotalMinute % 60;
        this.minute = CurrentMinute;
        long TotalHour = TotalMinute / 60;
        long CurrentHour = TotalHour % 24;
        this.hour = CurrentHour;
    }

    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }

    public static void main(String [] args) {
        Time CurrentTime = new Time();
        Time DesignatedElapseTime = new Time(555550000);
        System.out.println("Current Time = " + CurrentTime);
        System.out.println("Elapse Time in time format = " + DesignatedElapseTime);
    }
}
