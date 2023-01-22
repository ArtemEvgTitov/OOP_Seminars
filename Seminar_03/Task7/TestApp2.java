package Seminar_03.Task7;

public class TestApp2 {
    public static void main(String[] args) {
        Function<Integer, String> ob = x -> String.valueOf(x) + "$";
        System.out.println(ob.apply(4));
    }
}
