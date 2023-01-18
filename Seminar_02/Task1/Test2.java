package Seminar_02.Task1;

public class Test2 implements Program {
    int start;
    int value;

    @Override
    public int getNext() {
        value += 3;

        return value;
    }

    @Override
    public void reset() {
        start = 0;
        value = 0;
    }

    @Override
    public void setStart(int x) {
        start = x;
        value = x;
    }
}
