package com.sp.collection.queue;

import java.util.ArrayDeque;

public class ArrayDeque_1_nov_25 {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.offer(10);
		ad.offerFirst(20);
		ad.offerLast(30);
		System.out.println(ad);
		ad.pollFirst();
		ad.poll();
		ad.pollLast();
		System.out.println(ad);

	}

}
