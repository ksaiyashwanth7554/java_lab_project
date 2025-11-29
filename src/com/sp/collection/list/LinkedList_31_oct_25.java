package com.sp.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_31_oct_25 {

	public static void main(String[] args) {
		LinkedList<Integer> al  = new LinkedList<>();
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(50);
		al.add(40);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		System.out.println(al.removeFirst());
		System.out.println(al.getLast());

	}

}
