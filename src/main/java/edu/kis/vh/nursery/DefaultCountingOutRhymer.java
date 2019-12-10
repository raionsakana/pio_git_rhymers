package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int DEFAULT = -1;
    public static final int EMPTY = -1;


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
        return total == CAPACITY - 1;
    }

    protected int peek() {
        if (check())
            return DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (check())
            return DEFAULT;
        return numbers[total--];
    }

}
