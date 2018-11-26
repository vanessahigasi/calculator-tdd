package tech.bts.calculatortdd.pointers;

public class Clock {

    private int seconds;
    private int minutes;
    private int hours;

    public Clock(int h, int m, int s) {
        this.seconds = s;
        this.minutes = m;
        this.hours = h;
    }

    public String getTime() {

        return prefixZero(this.hours)
                + ":" + prefixZero(this.minutes)
                + ":" + prefixZero(this.seconds);

        /*
        String result = "";
        result += prefixZero(this.hours);
        result += ":";
        result += prefixZero(this.minutes);
        result += ":";
        result += prefixZero(this.seconds);
        return result;
        */

    }

    public void addSeconds(int s) {

        this.seconds += s;

        this.minutes += this.seconds / 60;
        this.seconds %= 60; //remaining

        this.hours += this.minutes / 60;
        this.minutes %= 60;
    }

    private String prefixZero(int number) {

        return ( number < 10 ? "0" : "") + number;
    }


}
