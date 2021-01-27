package com.revature.DriverTester;

import com.revature.eval.java.core.EvaluationService;

public class Driver {
    // for non static methods, you must instantiate a class to use it and invoke it's methods
    public static void main(String[] args) {
        System.out.println("Start manual testing...");

        String myString = "Hello! I am Juan Ramirez";
        EvaluationService testUnit = new EvaluationService();

        System.out.println(testUnit.reverse(myString));

        System.out.println(testUnit.printMegaBytesAndKiloBytes(2400));
    }
}
