package br.com.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList3 {
	public static void main(String[] args) {
		String[] array = { "bob", "john"};
		List<String> list =Arrays.asList(array);
		System.out.println(list.size());
		list.set(1, "richard");
		array[0] = "new";
		System.out.println(Arrays.toString(array));
		System.out.println(list.toString());
		//list.remove(1); // nao permitido pq é um array
		
		String[] arrayString = list.toArray(new String[0]);
		Object[] arrayObject = list.toArray();
		arrayString[0] = "19";
		arrayObject[0] = (Object) "17";
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arrayString));
		System.out.println(Arrays.toString(arrayObject));
	}
}
