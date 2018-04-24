package br.com.arraylist;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList5 {
	public static void main(String[] args) {
		List lst = new ArrayList<>(1);
		lst.add("renato");
		lst.add(100);
		lst.add(.01);
		for (Object object : lst) {
			System.out.println(object);
		}
		List<String> strings = new ArrayList<String>();
		strings.add("A");
		strings.add("B");
		strings.add(0, "1");
		strings.set(2, "2");
		System.out.println(strings);
		
		strings.spliterator();
		strings.retainAll(new ArrayList<String>() {{add("A"); add("1");}});
		Iterator iterator = strings.listIterator();
		for(;iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
