package tech.bts.calculatortdd;

import org.junit.Test;
import tech.bts.calculatortdd.SimpleCalculator.SimpleCalculator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void test_add() {

        //1.setup the object needed
        SimpleCalculator calc = new SimpleCalculator(0);

        //2.call the method
        calc.add(2);
        calc.add(1);

        //3.test/check
        //assertEquals(3, calc.getValue());
        assertThat(calc.getValue(), is(3));
    }

    @Test
    public void test_multiply() {

        SimpleCalculator calc = new SimpleCalculator(3);

        calc.multiply(4);

        assertThat(calc.getValue(), is(12));
        //assertEquals(12, calc.getValue());
    }

    @Test
    public void test_subtract() {

        SimpleCalculator calc = new SimpleCalculator(12);

        calc.subtract(3);

        assertThat(calc.getValue(), is(9) );
    }


    @Test
    public void test_division() {

        SimpleCalculator calc = new SimpleCalculator(9);

        calc.divide(2);

        assertThat(calc.getValue(), is(4));
    }

    @Test
    public void test_square() {

        SimpleCalculator calc = new SimpleCalculator(6);

        calc.square();

        assertThat(calc.getValue(), is(36));
    }
}