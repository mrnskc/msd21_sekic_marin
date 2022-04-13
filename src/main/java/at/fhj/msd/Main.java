package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(3,2));
        System.out.println(calc.minus(4,3));
        System.out.println(calc.divide(8,4));
        System.out.println(calc.multiply(6,5));
    }
}
