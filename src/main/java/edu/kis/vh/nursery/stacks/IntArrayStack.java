package edu.kis.vh.nursery.stacks;

import edu.kis.vh.nursery.IntStackInterface;

public class IntArrayStack implements IntStackInterface {

    private static final int CAPACITY = 12;
    private static final int DEFAULT = 0;
    private static final int EMPTY = -1;

    private final int[] numbers = new int[CAPACITY];
    private int total = EMPTY;

    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean check() {
        return total == EMPTY;
    }

    @Override
    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    @Override
    public int peek() {
        if (check())
            return DEFAULT;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (check())
            return DEFAULT;
        return numbers[total--];
    }
    // TODO: method not used, can be consider to delete
    @Override
    public int getTotal() {
        return total;
    }

}
