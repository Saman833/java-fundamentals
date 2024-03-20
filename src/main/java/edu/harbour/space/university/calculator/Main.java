package edu.harbour.space.university.calculator;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        CalculatorFacade calculatorFacade = new CalculatorFacade();
        LOGGER.info(STR."Output: \{calculatorFacade.run()}");
    }
}
