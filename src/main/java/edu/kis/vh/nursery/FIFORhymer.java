package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

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
