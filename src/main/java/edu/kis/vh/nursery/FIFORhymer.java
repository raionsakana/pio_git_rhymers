package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntStackInterface temp = new IntLinkedList();

    public FIFORhymer(IntStackInterface stack) {
        super(stack);
    }

    public FIFORhymer() {}

    @Override
    public int countOut() {

        while (!check())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.check())
            countIn(temp.countOut());

        return ret;
    }

//    alt + ← oraz alt + → pozwalają na przemieszczenie się pomiędzy otwartymi plikami w IDE
}
