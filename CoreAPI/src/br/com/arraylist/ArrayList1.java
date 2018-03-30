package br.com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		final List list = new ArrayList();
		list.add("String");
		list.add(4);
		int x=5;
		
		list.add(x);
		System.out.println(list.toString());
		List list2 = new ArrayList();
		list2.add("renato");
		list2.add(0,"renato0");
		list2.add(1,"renato1");
		list2.add(0,"ren0");
		//list2.add(8,"renato8");
		
		System.out.println(list2.toString());
		list2.remove(0);
		System.out.println(list2.toString());
		list2.remove("renato");
		System.out.println(list2.toString());
		list2.set(1,"joao");
		System.out.println(list2.toString());
		System.out.println(list.toString());
	}
}
