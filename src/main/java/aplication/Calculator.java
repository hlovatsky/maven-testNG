package aplication;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int substraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int squareRoot(int a) {
        return (int) Math.sqrt(a);
    }

    public double numberToPower(double a, double b) {
        return Math.pow(a, b);
    }

    public double averageValue(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public boolean evenOrOdd(double a) {
        return a % 2 == 0;
    }

    public int biggestValue(int a, int b) {
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            return 0;
        }
    }

    public int addMultiParam(int... T) {
        int sum = 0;
        for (int j : T) sum += j;
        return sum;
    }

    public int divByZero(int a, int b) {
        if (b == 0) {
            return -100;
        } else {
            return a / b;
        }
    }
}
