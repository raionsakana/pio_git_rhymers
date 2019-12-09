package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!check() && in > peek())
			totalRejected++;
		else
			super.countIn(in);
	}
}
