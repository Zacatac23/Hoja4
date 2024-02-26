package org.example;

class CalculatorSingleton {
    private static Calculator instance;

    private CalculatorSingleton() {}

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }
}
