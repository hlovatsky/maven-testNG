package hardTests;

import aplication.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HardTests {
    Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - divide by zero case
    @Test
    public void divByZero() {
        int actualResult = calc.divByZero(5, 0);
        assertEquals(actualResult, -100);
    }

    //TODO (**)
    //add tests for new method - addition with multiple parameters
    @Test
    public void addMultiParameters() {
        int actualResult = calc.addMultiParam(8, 8, 9, 11, 22);
        assertEquals(actualResult, 50);
    }
}
