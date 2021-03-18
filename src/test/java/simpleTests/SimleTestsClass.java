package simpleTests;

import aplication.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SimleTestsClass {
    Calculator calc = new Calculator();

    // TODO (*)
    //add tests for new methods (multiply, division, subtraction, square root, x^2)

    @Test(groups = {"Regression"})
    public void testAddTwoPositiveValues() {
        int actualResult = calc.add(10, 5);
        assertEquals(actualResult, 15);
    }

    @Test
    public void substraction() {
        int actualResult = calc.substraction(10, 5);
        assertEquals(actualResult, 5);
    }

    @Test
    public void multiplication() {
        int actualResult = calc.multiplication(10, 5);
        assertEquals(actualResult, 50);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void division() {
        int actualResult = calc.division(10, 5);
        assertEquals(actualResult, 2);
    }

    @Test
    public void squareRoot() {
        int actualResult = calc.squareRoot(10);
        assertEquals(actualResult, 3);
    }

    @Test
    public void numberToPower() {
        double actualResult = calc.numberToPower(4.0, 3.0);
        assertEquals(actualResult, 64.0, 64.1);
    }
}

