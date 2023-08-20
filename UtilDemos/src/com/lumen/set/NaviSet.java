package com.lumen.set;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NaviSet {
	public static void main(String[] args) {
		NavigableSet<String> set = new TreeSet<>(Arrays.asList("Apple","Orange","Mango","Grape","Grapes" ));
		
		System.out.println(set);
		System.out.println(set.descendingSet());
		
		//headset
		SortedSet<String> headData = set.headSet("Orange");
		System.out.println(headData);
		
		SortedSet<String> headData1 = set.headSet("Orange,true");
		System.out.println(headData1);
		
		SortedSet<String> tailData = set.tailSet("Orange");
		System.out.println(tailData);
		
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.floor("grapes"));
		System.out.println(set.floor("grape"));
		System.out.println();
		System.out.println(set.ceiling("grapes"));
		System.out.println(set.ceiling("ora"));
			
	}

}
