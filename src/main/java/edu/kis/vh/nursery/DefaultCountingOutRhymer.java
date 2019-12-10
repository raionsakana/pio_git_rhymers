package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int MINUS_ONE = -1;
    public static final int EMPTY = -1;
    public static final int LAST_INDEX = 11;


    private final int[] numbers = new int[CAPACITY];

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean check() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == LAST_INDEX;
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
