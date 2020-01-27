package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer() {
        this.intLinkedList = new IntLinkedList();
    }

    public void countIn(int in) {
        if (!isFull())
            intLinkedList.push(in);
    }

    boolean check() {
        return intLinkedList.isEmpty();
    }

    boolean isFull() {
        return intLinkedList.isFull();
    }

    int peek() {
        if (check())
            return IntLinkedList.EMPTY;
        return intLinkedList.top();
    }

    public int countOut() {
        if (check())
            return IntLinkedList.EMPTY;
        return intLinkedList.pop();
    }
    // TODO: method not used, can be consider to delete
    public int getTotal() {
        return -1;
    }
}
