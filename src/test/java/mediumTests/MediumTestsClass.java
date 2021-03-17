package mediumTests;

import aplication.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class MediumTestsClass {
    Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - average value
    @Test(groups = {"Smoke"})
    public void averageValue() {
        double actualResult = calc.averageValue(3.0, 5.0, 7.0);
        assertEquals(actualResult, 5.0);
    }

    //TODO (**)
    //add tests for new method - even or odd
    @Test
    public void evenOrOdd() {
        boolean actualResult = calc.evenOrOdd(5.0);
        assertFalse(false);
    }

    //TODO (**)
    //add tests for new method - biggest value
    @Test
    public void biggestValue() {
        int actualResult = calc.biggestValue(5, 3);
        assertEquals(actualResult, 5);
    }
}
