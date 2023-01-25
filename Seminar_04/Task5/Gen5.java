package Seminar_04.Task5;

public class Gen5 {
    
    private int sum;

    <R extends Number> Gen5(R arg){
        sum = 0;

        for (int i = 0; i <= arg.intValue(); i++) {
            sum += i;
        }
    }

    int getSum(){
        return sum;
    }
}

class Gen5Demo{
    public static void main(String[] args) {
        Gen5 ob = new Gen5(4.0);
        System.out.println("Сумма целых чисел от 0 до 4: " + ob.getSum());
    }
}
