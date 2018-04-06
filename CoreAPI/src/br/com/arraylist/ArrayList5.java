package br.com.arraylist;


import java.util.ArrayList;
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
		
	}
}
