package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TWELVE = 12;
    public static final int MINUS_ONE = -1;
    public static final int MAX = 11;


    private int[] numbers = new int[TWELVE];

    public int total = MINUS_ONE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean check() {
        return total == MINUS_ONE;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peek() {
        if (check())
            return MINUS_ONE;
        return numbers[total];
    }

    public int countOut() {
        if (check())
            return MINUS_ONE;
        return numbers[total--];
    }

}
