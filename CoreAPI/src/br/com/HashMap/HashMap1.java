package br.com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		Map<Map<String,String>, String> mainMap = new HashMap<>();
		Map<String,String> map1 = new HashMap<>();
		map1.put("A", "A");
		Map<String,String> map2 = new HashMap<>();
		map2.put("A", "A");
		Map<String,String> map3 = new HashMap<>();
		map3.put("A", "A");
		mainMap.put(map1, "m1"); //map1 was in key, dont in object(value)
		mainMap.put(map2, "m2");
		mainMap.put(map3, "m3");
		System.out.println(mainMap.size());
	}
}
