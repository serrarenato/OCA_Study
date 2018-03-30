package br.com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		populateList(list);
		System.out.println(list.toString());
		System.out.println("teste:"+list);
		list.remove(1);
		System.out.println(list.toString());
		populateList(list);
		list.remove(new Integer(1));
		System.out.println(list.toString());
		Integer[] listaArray = list.toArray(new Integer[0]);
		listaArray[1]=6;
		System.out.println(list.toString());
		System.out.println(Arrays.toString(listaArray));
	}
	public static void populateList(List<Integer> list){
		list.clear();
		list.add(1);
		list.add(5);
		list.add(2);
	}
}
