package Seminar_02.Task1;

public class Test1 implements Program, Program2 {
    int start;
    int value;
    int prew;

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

    int getPrew(){
        return prew;
    }

    @Override
    public void reset1() {
        start = 1;
        value = 1;
    }
    
}
