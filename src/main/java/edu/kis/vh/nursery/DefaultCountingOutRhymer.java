package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int DEFAULT = -1;
    private static final int EMPTY = -1;

    private final int[] numbers = new int[CAPACITY];
    private int total = EMPTY;
  
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean check() {
        return total == EMPTY;
    }

    private boolean isFull() {
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

    public int getTotal() {
        return total;
    }
}
