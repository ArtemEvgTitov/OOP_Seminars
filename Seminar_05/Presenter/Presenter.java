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
}
