package Seminar_05.Presenter;

import Seminar_05.Console.View;
import Seminar_05.Model.CalcModel;

public class Presenter {
    View view;
    CalcModel model;

    public Presenter(CalcModel m, View v) {
        this.model = m;
        this.view = v;
    }

    public void buttonClick() {
        double x = view.getValue("Введите X: ");
        double y = view.getValue("Введите Y: ");
        model.setX(x);
        model.setY(y);
        double result = model.result();
        view.show("Result = ", result);
    }
}