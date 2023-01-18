package Seminar_02.Task2;

public class iCountD implements iCount {
    public static void main(String[] args) {
        int numbs[] = new int [MAX];

    for (int i = MIN; i < 11; i++) {
        if (i >= MAX){
            System.out.println(ERROR);
        }
        else {
            numbs[i] = i;
            System.out.println(numbs[i] + " ");
        }
    }
    }
}
