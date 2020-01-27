package edu.kis.vh.nursery.stacks;

import edu.kis.vh.nursery.IntStackInterface;

// TODO: class is not used, can be deleted
public class IntLinkedList implements IntStackInterface {

	public static final int EMPTY = 0;
	private Node last;
	int i;

    @Override
	public void countIn(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}
    @Override
	public boolean check() {
		return last == null;
	}

    @Override
	public boolean isFull() {
		return false;
	}

    @Override
	public int peek() {
		if (check())
			return EMPTY;
		return last.value;
	}

    @Override
	public int countOut() {
		if (check())
			return EMPTY;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

    @Override
    public int getTotal() {
        return -1;
    }


}

class Node {

	final int value;
	Node prev, next;

	Node(int i) {
		value = i;
	}

}

