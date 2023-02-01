package Seminar_05.Presenter;

import Seminar_05.Console.View;
import Seminar_05.Model.SumCalc;

public class Presenter {
    View view;
    SumCalc model;

    public Presenter(SumCalc m, View v){
        this.model = m;
        this.view = v;
    }

    public void buttonClick(){
        double x = view.getValue("Введите X: ");
        double y = view.getValue("Введите Y: ");
        model.setX(x);
        model.setY(y);
        double result = model.result();
        view.show("Sum = ", result);
    }
}
