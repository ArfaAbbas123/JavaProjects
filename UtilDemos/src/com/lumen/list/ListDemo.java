package com.lumen.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("Java");
		//list.add(100);
		list.add("Spring");
		//list.add(100.8);
		list.add("Autumn");
		//list.add(1);
		System.out.println(list);
		list.set(2, "Arfa");
		System.out.println(list);
		System.out.println(list.size());
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name.toLowerCase());
		}
		
		Collections.sort(list);
		
		System.out.println(list);
		
		for(String name:list)
			System.out.println(name.toUpperCase());
		
		System.out.println(list.size());
		list.add(1, "fats");
		list.add(3, "Nevere");
		System.out.println(list);
	}

}
