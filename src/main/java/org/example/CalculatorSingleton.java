package org.example;

/**
 * The `CalculatorSingleton` class provides a way to create a singleton instance of the `Calculator`
 * class in Java.
 */
class CalculatorSingleton {
    private static Calculator instance;

    private CalculatorSingleton() {}

    /**
     * The getInstance method returns a singleton instance of the Calculator class, creating it if it
     * doesn't already exist.
     * 
     * @return The `Calculator` instance is being returned.
     */
    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }
}
