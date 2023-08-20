package com.lumen.set;

import java.util.HashSet;
import java.util.Set;

public class HashLinked {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Apple");
		hashSet.add("Orange");
		hashSet.add("Banana");
		hashSet.add("Mango");
		hashSet.add("100");
		hashSet.add(null);
		hashSet.add("Apple");
		System.out.println(hashSet);
		System.out.println(hashSet);
		for(String element:hashSet) {
			System.out.println(element);
		}
	
	}
}
