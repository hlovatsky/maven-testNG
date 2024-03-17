package hardTests;

import aplication.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HardTests {
    Calculator calc = new Calculator();

    @Test
    public void divByZero() {
        int actualResult = calc.divByZero(5, 0);
        assertEquals(actualResult, -100);
    }

    @Test(groups = {"Regression"})
    public void addMultiParameters() {
        int actualResult = calc.addMultiParam(8, 8, 9, 11, 22);
        assertEquals(actualResult, 48);
    }
}
