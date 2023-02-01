package Seminar_05.Console;

import java.util.Scanner;

public class View {
    
    Scanner scanner = new Scanner(System.in);

    public double getValueX(){
        return scanner.nextDouble();
    }

    

    public void show(double value, String data){

        System.out.printf("%s %s", data, value);
    }
}
