package br.com.internas;

import java.util.Arrays;
import java.util.Comparator;

public class Pockets {
	float y = 13.0f;
	 protected void finalize() {		
		  System.out.println("Calling finalize");
		  } 
	{System.out.println("teste bloco1");}
	public Pockets(){
		System.out.println("Teste Abertura");
		
	}
	{System.out.println("teste bloco2");}
	public static void main(String... a) {
	//	boolean teste;
		Object test2;
		String [] sa= { "b","a","c"};
		Sorter s = new Pockets().new Sorter();
		for (String s2:sa) System.out.println(s2 + " ");
		Arrays.sort(sa, s);
		System.out.println();
		{for (String s2:sa) System.out.println(s2 + " ");}
	//	if (teste==false){
			test2=1;
	//	}
	}
	{System.out.println("teste bloco3");}
	class Sorter implements Comparator<String>{
		public int compare(String a, String b){
			return b.compareTo(a);
		}
	}
}
