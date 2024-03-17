package hardTests;

import aplication.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class HardTests {
    private static final Logger LOGGER = LogManager.getLogger(HardTests.class);
    Calculator calc = new Calculator();

    @Test
    public void divByZero() {
        int actualResult = calc.divByZero(5, 0);
        assertEquals(actualResult, -100);
    }

    @Test(groups = {"Regression"})
    public void addMultiParameters() {
        int actualResult = calc.addMultiParam(8, 8, 9, 11, 22);
        assertEquals(actualResult, 58);
        LOGGER.info("Actual result is: {}", actualResult);
    }
}
