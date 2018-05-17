package br.com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		populateList(list);
		System.out.println("Inicial:"+list.toString());

		list.remove(1);
		System.out.println("Removendo indice"+list.toString());
		populateList(list);
		list.remove(new Integer(1));
		System.out.println("Removendo Objeto da lista"+list.toString());
		populateList(list);
		Integer[] listaArray = list.toArray(new Integer[0]);
		listaArray[1]=6;
		System.out.println("Lista Inicial"+list.toString());
		System.out.println("Array:"+Arrays.toString(listaArray));
	
		list=Arrays.asList(listaArray);
		list.set(1,9); //you dont use add, because dont change size of arrayList.
		System.out.println("Lista Convertida"+list.toString());
		System.out.println("Array:"+Arrays.toString(listaArray));
		
	}
	public static void populateList(List<Integer> list){
		list.clear();
		list.add(1);
		list.add(5);
		list.add(2);
	}
}
