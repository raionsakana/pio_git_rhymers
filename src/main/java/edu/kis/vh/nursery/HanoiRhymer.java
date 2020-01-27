package edu.kis.vh.nursery;

/**
 * Class HanoiRhymer extends DefaultCountingOutRhymer
 */

public class HanoiRhymer extends DefaultCountingOutRhymer {

	/**
	 * Number of recjection, used in countIn method
	 */
	private int totalRejected = 0;

	/**
	 *	Constructor HanoiRhymer.
	 *	@param stack stack to use
	 */

	public HanoiRhymer(IntStackInterface stack) { super(stack); }

	/**
	 *	Deafult constructor HanoiRhymer.
	 */
	public HanoiRhymer() {
		super();
	}


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
