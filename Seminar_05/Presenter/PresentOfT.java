package Seminar_05.Presenter;

import Seminar_05.Console.View;
import Seminar_05.Model.CalcModel;

public class PresentOfT<T extends CalcModel> {
    View view;
    CalcModel model;

    public PresentOfT(T m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick() {
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        double result = model.result();
        view.show("Result: ", result);
    }
}
