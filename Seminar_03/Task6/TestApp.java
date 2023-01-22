package Seminar_03.Task6;

public class TestApp {
    public static void main(String[] args) {
        UnaryOperator<Integer> ob = x -> x * x;
        System.out.println(ob.apply(5));
    }
}
