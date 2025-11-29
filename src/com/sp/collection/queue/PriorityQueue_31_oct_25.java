package com.sp.collection.queue;
import java.util.*;
public class PriorityQueue_31_oct_25 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq  = new PriorityQueue<>();
		//PRIORITY QUEUE INSERTING THE DATA WE USE OFFER
		pq.offer(50);
		pq.offer(60);
		pq.offer(40);
		pq.offer(20);
		System.out.println(pq);
		//PRIORITY QUEUE DELETING THE DATA WE USE POLL
		pq.poll();
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
	}

}
