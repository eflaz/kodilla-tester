package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a,b);
        boolean correct1 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct1) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int doublePowerResult = calculator.doublePower(sumResult);
        boolean correct2 = ResultChecker.assertEquals(169, doublePowerResult);
        if (correct2) {
            System.out.println("Metoda doublePower działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda doublePower nie działa poprawnie dla liczb " + a + " i " + b);
        }

    }
}
