package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

	public static void main(String[] args) {
		DefaultRhymersFactory factory = new DefaultRhymersFactory();
		testRhymers(factory);
	}

	private static void testRhymers(RhymersFactory factory) {

		DefaultCountingOutRhymer[] rhymers = prepareDefaultCountingOutRhymers(factory);
		java.util.Random rn = new java.util.Random();

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		for (int i = 1; i < 15; i++)
			rhymers[3].countIn(rn.nextInt(20));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].check())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((HanoiRhymer) rhymers[3]).reportRejected());
	}

	private static DefaultCountingOutRhymer [] prepareDefaultCountingOutRhymers(RhymersFactory factory) {
		DefaultCountingOutRhymer[] rhymers  = {
				factory.getStandardRhymer(),
				factory.getFalseRhymer(),
				factory.getFIFORhymer(),
				factory.getHanoiRhymer()
		};

		return rhymers;
	}

}