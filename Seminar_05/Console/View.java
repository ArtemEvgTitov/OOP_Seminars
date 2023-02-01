package Seminar_05.Console;

import java.util.Scanner;

public class View {
    
    Scanner scanner = new Scanner(System.in);

    public double getValue(String data){
        System.out.println(data);
        return scanner.nextDouble();
    }

    

    public void show(String data, double value){

        System.out.printf("%s %s", data, value);
    }
}
