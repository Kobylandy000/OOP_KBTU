package lab3.task5;

import java.util.Objects;

/**
 * TASK 5: Time класы — week 2-ден импортталған (Comparable іске асырылған)
 */
public class Time implements Comparable<Time>, Cloneable {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) throw new IllegalArgumentException("Hours: 0-23");
        if (minutes < 0 || minutes > 59) throw new IllegalArgumentException("Minutes: 0-59");
        if (seconds < 0 || seconds > 59) throw new IllegalArgumentException("Seconds: 0-59");
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    @Override
    public int compareTo(Time other) {
        return Integer.compare(this.toSeconds(), other.toSeconds());
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Time)) return false;
        Time t = (Time) o;
        return hours == t.hours && minutes == t.minutes && seconds == t.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }

    @Override
    public Time clone() throws CloneNotSupportedException {
        return (Time) super.clone();
    }
}
