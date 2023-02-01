package Seminar_05.Console;

import java.util.Scanner;

public class View {

    Scanner scanner = new Scanner(System.in);

    public double getValue(String data) {
        System.out.println(data);
        return scanner.nextDouble();
    }

    public void show(String data, double value) {

        System.out.printf("%s %s", data, value);
    }

    public int getChoice() {
        System.out.println("Choice operation:");
        System.out.println("\t1. Summarize");
        System.out.println("\t2. Subtraction");
        System.out.println("\t3. Multiplication");
        System.out.println("\t4. Division");
        return scanner.nextInt();
    }
}
