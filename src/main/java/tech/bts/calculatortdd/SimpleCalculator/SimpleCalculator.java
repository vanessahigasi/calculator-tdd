package tech.bts.calculatortdd.SimpleCalculator;

public class SimpleCalculator {

    private int value;


    public SimpleCalculator(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void clear() {
        this.value = 0;
    }

    public void add(int x) {
        this.value = this.value + x;
    }

    public void subtract(int x) {
        this.value = this.value - x;
    }

    public void multiply(int x) {
        this.value = this.value * x;
    }

    public void divide(int x) {
        this.value = this.value / x;
    }

    public void square () {
        this.value = this.value * this.value;
    }

    public void power () {

    }
}
