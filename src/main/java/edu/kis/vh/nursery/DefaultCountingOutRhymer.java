package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean check() {
        return intArrayStack.check();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int peek() {
        return intArrayStack.peek();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }
}
