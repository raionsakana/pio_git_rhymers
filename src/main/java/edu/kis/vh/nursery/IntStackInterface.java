package edu.kis.vh.nursery;

public interface IntStackInterface {
    void countIn(int in);

    boolean check();

    boolean isFull();

    int peek();

    int countOut();

    // TODO: method not used, can be consider to delete
    int getTotal();
}
