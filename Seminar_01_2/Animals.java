package Seminar_01_2;

public class Animals {
    private String name;

    void Speak() {
        System.out.println("я не умею говорить");
    }

    String getName() {
        return this.name;
    }
}

class Cat extends Animals { 
    @Override
    void Speak() {
        System.out.println("мяу");
    }
}

class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.Speak();
    }
}