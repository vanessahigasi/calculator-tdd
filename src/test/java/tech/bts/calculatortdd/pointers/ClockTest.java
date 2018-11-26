package tech.bts.calculatortdd.pointers;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ClockTest {

    @Test
    public void test_get_time() {

        Clock clock = new Clock(3,20,15);

        assertThat(clock.getTime(), is("03:20:15"));
    }

    @Test
    public void test_few_second() {

        Clock clock = new Clock(13,20,7);
        assertThat(clock.getTime(), is("13:20:07"));
    }

    @Test
    public void test_few_minutes() {

        Clock clock = new Clock(16,8,20);
        assertThat(clock.getTime(), is("16:08:20"));
    }

    @Test
    public void test_few_hours() {

        Clock clock = new Clock(3,18,20);
        assertThat(clock.getTime(), is("03:18:20"));
    }

    @Test
    public void test_small_values() {

        Clock clock = new Clock(3,5,6);
        assertThat(clock.getTime(), is("03:05:06"));
    }

    @Test
    public void test_zeros() {

        Clock clock = new Clock(0,0,0);
        assertThat(clock.getTime(), is("00:00:00"));
    }

    @Test
    public void add_seconds() {

        Clock clock = new Clock(13,20,15);
        clock.addSeconds(12);
        assertThat(clock.getTime(), is("13:20:27"));


    }

    @Test
    public void add_seconds_to_next_minute() {

        Clock clock = new Clock(13,20,50);
        clock.addSeconds(12);
        assertThat(clock.getTime(), is("13:21:02"));
    }

    @Test
    public void add_seconds_to_add_more_minutes() {

        Clock clock = new Clock(13,20,50);
        clock.addSeconds(90);
        assertThat(clock.getTime(), is("13:22:20"));
    }

    @Test
    public void add_seconds_until_adds_more_minutes() {

        Clock clock = new Clock(13,20,50);
        clock.addSeconds(90);
        assertThat(clock.getTime(), is("13:22:20"));
    }

    @Test
    public void add_seconds_until_adds_more_hours() {

        Clock clock = new Clock(1,3,5);
        clock.addSeconds((60 * 60 * 3) + (60 * 5) + 30);
        assertThat(clock.getTime(), is("04:08:35"));
    }

    @Test
    public void modify_two_clocks() {

        Clock clock1 = new Clock(0,0,0);
        Clock clock2 = new Clock(0,0,0);

        addSecs(clock1, clock2, 2);


        assertThat(clock1.getTime(), is("00:00:02"));
        assertThat(clock2.getTime(), is("00:00:02"));
    }

    void addSecs(Clock clock1, Clock clock2, int s) {

        clock1.addSeconds(s);
        clock2.addSeconds(s);

    }


}