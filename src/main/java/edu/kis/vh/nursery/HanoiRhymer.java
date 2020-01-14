package edu.kis.vh.nursery;

/**
 * Represents an employee
 */

public class HanoiRhymer extends DefaultCountingOutRhymer {

	/**
	 * Number of recjection, used in countIn method
	 */
	private int totalRejected = 0;

	/** getter method to return totalRejected value
	 */
	int reportRejected() {
		return totalRejected;
	}

	/** method allow to add to array, when number is in constraints
		@param in number to add
	 */
	@Override
	public void countIn(int in) {
		if (!check() && in > peek())
			totalRejected++;
		else
			super.countIn(in);
	}
}
