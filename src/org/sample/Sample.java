package org.sample;

import java.util.*;

public class Sample {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();

		li.add(10);
		li.add(20);
		li.add(50);
		li.add(40);
		li.add(30);
		li.add(10);
		System.out.println(li);
		// size

		int si = li.size();
		System.out.println(si);
		//pickup one object from list
		Integer i = li.get(3);
		System.out.println(i);
		Integer j = li.get(7);
		System.out.println(j);
	}
}