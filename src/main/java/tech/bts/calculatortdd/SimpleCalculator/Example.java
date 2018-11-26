package tech.bts.calculatortdd.SimpleCalculator;

public class Example {

    public static void main(String[] args) {

        SimpleCalculator calc = new SimpleCalculator(0);

        calc.add(2); //value = 2
        calc.add(1); //value = 3
        calc.multiply(4); //value = 12
        calc.subtract(3); // value = 9
        calc.divide(2); // value = 4
        int x = calc.getValue();
        System.out.println(x);
    }
}
