package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
//        Creating a Logger
        Logger logger = LogManager.getLogger();

//        logger.debug("It is a debug logger");
        logger.error("It is an error logger");
//        logger.fatal("It is a fatal logger");
        logger.info("It is an info logger");
//        logger.trace("It is a trace logger");
//        logger.warn("It is a warn logger");

        Calculator calc = new Calculator();


        System.out.println(calc.add(3,2));
        System.out.println(calc.minus(4,3));
        System.out.println(calc.divide(8,4));
        System.out.println(calc.multiply(6,5));
    }
}
