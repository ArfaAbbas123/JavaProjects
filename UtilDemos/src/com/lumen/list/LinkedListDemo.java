package com.lumen.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		System.out.println(list.size());
		list.add("Java");
		//list.add(100);
		list.add("Spring");
		//list.add(100.8);
		list.add("Autumn");
		//list.add(1);
		
		System.out.println(list);
		list.addFirst("Html");
		list.addLast("Css");
		System.out.println(list);
		list.set(2, "Arfa");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name.toLowerCase());
		}
		
		//System.out.println("Rever");
		Collections.sort(list);
		
		System.out.println(list);
		
		for(String name:list)
			System.out.println(name.toUpperCase());
		
		System.out.println(list.size());
		list.add(1, "fats");
		list.add(3, "Nevere");
		System.out.println(list);
		
		System.out.println("Methods:");
		System.out.println(list.peek());
		System.out.println(list);
		System.out.println(list.poll());
		System.err.println(list);
		System.out.println(list.poll());
		System.err.println(list);
		System.out.println(list.poll());
		System.err.println(list);
		System.out.println(list.poll());
		System.err.println(list);
		System.out.println(list.poll());
		System.err.println(list);
		System.out.println(list.poll());
		System.err.println(list);
		System.out.println(list.poll());
		System.err.println(list);
		System.out.println(list.poll());
		System.err.println(list);
		System.out.println(list.poll());
		System.err.println(list);
		
		
		
	}

}
