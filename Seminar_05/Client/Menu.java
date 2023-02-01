package Seminar_05.Client;

import java.util.Scanner;

import Seminar_05.Console.View;
import Seminar_05.Model.CalcModel;
import Seminar_05.Model.SumCalc;
import Seminar_05.Presenter.Presenter;

public class Menu {

    Presenter pr;
    View v;
    CalcModel m;

    public Menu(){
        pr = new Presenter(m, v);
    }
    
    Scanner scanner = new Scanner(System.in);

    int value = scanner.nextInt();

    public void showConsole(int value){
        switch (value) {
            case 1:
                break;
        
            default:
                break;
        }
    }

}
