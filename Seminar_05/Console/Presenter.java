package Seminar_05.Console;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v){
        this.model = m;
        this.view = v;
    }
}
