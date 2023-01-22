package Seminar_03.Task4;
import java.util.function.Predicate;;

public class LambdaTest {
    public static void main(String[] args) {
        Predicate<Integer> ob = x -> x > 0;
        System.out.println(ob.test(4));
        System.out.println(ob.test(-4));
    }
}
