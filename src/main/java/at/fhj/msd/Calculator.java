package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2) {
        logger.debug(number1 + number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        logger.debug(number1 + number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        logger.debug(number1 + number2);
        if (number2 == 0) {
            logger.error("Division by Zero not possible");
            return 0;
        } else {
            return number1 / number2;
        }
    }

    public double multiply(double number1, double number2) {
        logger.debug(number1 + number2);
        return number1 * number2;
    }

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
