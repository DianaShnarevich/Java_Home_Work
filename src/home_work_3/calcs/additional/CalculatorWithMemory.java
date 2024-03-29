package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private final ICalculator calculator;

    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
    }

    private double lastOperationResult;

    private double memory;

    private long counter = 0;

    private void incrementCountOperation() {
        counter++;
    }

    private void addLastOperationResult(double result) {
        lastOperationResult = result;
    }

    public void addMemory() {
        memory = lastOperationResult;
    }

    public double getMemory() {
        double tmp = memory;
        memory = 0;
        return tmp;
    }

    public long getCountOperation() {
        return counter;
    }

    public double addition(double x, double y) {
        incrementCountOperation();
        addLastOperationResult(calculator.addition(x, y));
        return calculator.addition(x, y);
    }

    public double subtraction(double x, double y) {
        incrementCountOperation();
        addLastOperationResult(calculator.subtraction(x, y));
        return calculator.subtraction(x, y);
    }

    public double multiplication(double x, double y) {
        incrementCountOperation();
        addLastOperationResult(calculator.multiplication(x, y));
        return calculator.multiplication(x, y);
    }

    public double division(double x, double y) {
        incrementCountOperation();
        addLastOperationResult(calculator.division(x, y));
        return calculator.division(x, y);
    }

    public double exponentiation(double x, int y) {
        incrementCountOperation();
        addLastOperationResult(calculator.exponentiation(x, y));
        return calculator.exponentiation(x, y);
    }

    public double module(double x) {
        incrementCountOperation();
        addLastOperationResult(calculator.module(x));
        return calculator.module(x);
    }

    public double square_root(double x) {
        incrementCountOperation();
        addLastOperationResult(calculator.square_root(x));
        return calculator.square_root(x);
    }
}
