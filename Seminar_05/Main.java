package Seminar_05;

import Seminar_05.Console.View;
import Seminar_05.Model.Mult;
import Seminar_05.Presenter.PresentOfT;


public class Main {
    public static void main(String[] args) {
        PresentOfT<Mult> p = new PresentOfT<>(new Mult(), new View());
        p.buttonClick();
    }
    
}
