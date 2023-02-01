package Seminar_05.Presenter;

import Seminar_05.Console.View;
import Seminar_05.Model.Model;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v){
        this.model = m;
        this.view = v;
    }
}
