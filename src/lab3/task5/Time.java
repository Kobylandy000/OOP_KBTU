package lab3.task5;

public class Time implements Comparable<Time>{
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    @Override
    public int compareTo(Time t) {
        if (this.hour != t.hour) {
            return Integer.compare(this.hour, t.hour);
        }
        if (this.minute != t.minute) {
            return Integer.compare(this.minute, t.minute);
        }
        return Integer.compare(this.second, t.second);
    }
}
