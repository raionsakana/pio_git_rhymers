package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntStackInterface intStackInterface;

    public DefaultCountingOutRhymer() {
        this.intStackInterface = new IntLinkedList();
    }

    DefaultCountingOutRhymer(IntStackInterface intStackInterface) {
        this.intStackInterface = intStackInterface;
    }

    public void countIn(int in) {
        if (!isFull())
            intStackInterface.countIn(in);
    }

    boolean check() {
        return intStackInterface.check();
    }

    boolean isFull() {
        return intStackInterface.isFull();
    }

    int peek() {
        if (check())
            return IntLinkedList.EMPTY;
        return intStackInterface.peek();
    }

    public int countOut() {
        if (check())
            return IntLinkedList.EMPTY;
        return intStackInterface.countOut();
    }
    // TODO: method not used, can be consider to delete
    public int getTotal() {
        return -1;
    }
}
