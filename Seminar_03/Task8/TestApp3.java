package Seminar_03.Task8;

public class TestApp3 {
    public static void main(String[] args) {
        Consumer<Integer> print = x -> System.out.printf("%d $ \n", x);
        print.accept(600);
    }
}
