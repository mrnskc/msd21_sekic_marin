package at.fhj.msd;

public class Calculator {
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        return number1 / number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double faculty(int number){
        if (number < 1){
            return 0;
        }
        if (number == 1){
            return 0;
        }else {
            return faculty(number-1)*number;
        }
    }
}
