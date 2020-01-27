package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	private final int TEST_VALUE = 4;
	private final int EMPTY_STACK_VALUE = -1;
	private final int STACK_CAPACITY = 12;

	@Test
	public void testCountInFIFORhymer() {
		FIFORhymer rhymer = new FIFORhymer();
		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
		rhymer.countIn(TEST_VALUE);
		Assert.assertEquals(TEST_VALUE, rhymer.countOut());
		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
	}

	@Test
	public void testCountInHanoiRhymer() {
		HanoiRhymer rhymer = new HanoiRhymer();
		rhymer.countIn(TEST_VALUE);
		Assert.assertEquals(TEST_VALUE, rhymer.peek());
	}

	@Test
	public void testReportRejectedHanoiRhymer() {
		HanoiRhymer rhymer = new HanoiRhymer();
		Assert.assertEquals(0, rhymer.reportRejected());
		rhymer.countIn(0);
		rhymer.countIn(1);
		Assert.assertEquals(1, rhymer.reportRejected());
	}

	@Test
	public void testCountInDefaultCountingOutRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		rhymer.countIn(TEST_VALUE);
		Assert.assertEquals(TEST_VALUE, rhymer.peek());
	}

	@Test
	public void testCheckDefaultCountingOutRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		Assert.assertTrue (rhymer.check());
		rhymer.countIn(TEST_VALUE);
		Assert.assertTrue(rhymer.check());
	}

	@Test
	public void testIsFullDefaultCountingOutRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		for (int i = 0; i < STACK_CAPACITY; i++, rhymer.countIn(TEST_VALUE))
			Assert.assertFalse(rhymer.isFull());

		Assert.assertFalse(rhymer.isFull());
	}

	@Test
	public void testPeekDefaultCountingOutRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.peek());
		rhymer.countIn(TEST_VALUE);
		Assert.assertEquals(TEST_VALUE, rhymer.peek());
		Assert.assertEquals(TEST_VALUE, rhymer.peek());
	}

	@Test
	public void testCountOutDefaultCountingOutRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());

		rhymer.countIn(TEST_VALUE);
		Assert.assertEquals(TEST_VALUE, rhymer.countOut());
		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
	}

}
