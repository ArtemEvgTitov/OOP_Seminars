package Seminar_02;

public class Test1 implements Program {
    int start;
    int value;

    @Override
    public int getNext() {
        value += 2;

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
