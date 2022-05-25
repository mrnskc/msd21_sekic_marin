package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author marinsekic
 */

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    /**
     * This method calculates the sum of two numbers.
     * @param number1 the first number
     * @param number2 the second number
     * @return the sum of both numbers
     */

    public double add(double number1, double number2) {
        logger.debug(number1 + number2);
        return number1 + number2;
    }

    /**
     * This method calculates the difference between two numbers.
     * @param number1 the first number
     * @param number2 the second number by which the first number is subtracted
     * @return the difference between number1 and number2
     */

    public double minus(double number1, double number2) {
        logger.debug(number1 + number2);
        return number1 - number2;
    }

    /**
     * This method divides two numbers and also does not allow a division by zero.
     * @param number1 the first number of the division which is divided
     * @param number2 the second number of the division with which is divided to
     * @return the result of the division
     */

    public double divide(double number1, double number2) {
        logger.debug(number1 + number2);
        if (number2 == 0) {
            logger.error("Division by Zero not possible");
            return 0;
        } else {
            return number1 / number2;
        }
    }

    /**
     * This method calculates the product of two numbers.
     * @param number1 first number
     * @param number2 second number
     * @return product of both numbers
     */

    public double multiply(double number1, double number2) {
        logger.debug(number1 + number2);
        return number1 * number2;
    }

    /**
     * This method calculates the faculty of one number
     * @param number number of which the faculty is calculated
     * @return faculty of the number
     */

    public double faculty(int number) {
        if (number < 1) {
            logger.debug(number);
            return 0;
        }
        if (number == 1) {
            logger.debug(number);
            return 1;
        } else {
            return faculty(number - 1) * number;
        }
    }
}
