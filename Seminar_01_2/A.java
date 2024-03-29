package Seminar_01_2;

class A {
    int i;
}

class B extends A {
    int i; // Эта переменная i скрывает переменную i из класса А

    B(int a, int b) {
        super.i = a; // Переменная i из класса A
                     // Здесь super.i ссылается на переменную i из класса A
        i = b;
    }

    void Show() {
        System.out.println("i в супер-классе = " + super.i);
        System.out.println("i в подклассе = " + i);
    }
}

class Test {
    public static void main(String[] args) {
        B ob = new B(1, 4);

        ob.Show();
    }
}