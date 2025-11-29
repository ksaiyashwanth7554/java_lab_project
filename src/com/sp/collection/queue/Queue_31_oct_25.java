package com.sp.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_31_oct_25 {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.poll();
		q.peek();

	}

}
