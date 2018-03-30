package br.com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList4 {
	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);
		ages.add(null);
		ages.size();
		
		System.out.println(Integer.parseInt("5"));
		System.out.println(Integer.valueOf("6"));
		
		for (Integer age : ages)
			System.out.println(age);
		
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		System.out.println(hex.toString());
	}
}
