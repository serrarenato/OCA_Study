// estudar number

package br.com.string;

public class StringBuilder1 {
	public static void main(String ...strings){
		StringBuilder sbuilder= new StringBuilder("teste");
		sbuilder.append("re");
		StringBuilder sbuilder2= sbuilder;
		sbuilder2 = sbuilder;
		sbuilder2.append('f');
		
		
		System.out.println(sbuilder);
		System.out.println(sbuilder2);
		StringBuilder sbuilder3= new StringBuilder(5);
		System.out.println(sbuilder3.length());
		sbuilder3.append("tes");
		System.out.println(sbuilder3.length());
		sbuilder3.append("tes");
		System.out.println(sbuilder3.length());
		System.out.println(sbuilder3.substring(3,5));
		System.out.println(sbuilder3);
		sbuilder3.append('3').append(true).append(1);
		System.out.println(sbuilder3);
		String x = sbuilder3.toString();
		StringBuilder sb = new StringBuilder("abc");
		String s = "abc";
		if (!s.equals(sb))
			System.out.println("eerer");
		StringBuilder teste = new StringBuilder( "ddd-ddd-dddd");
		teste.append ("teste",2,5);
		System.out.println(teste);
		teste.replace(3, 4, "pop");
		System.out.println(teste);
		teste=new StringBuilder( "ddd-ddd-dddd");
		teste.insert(0, "teste",3,5);
		System.out.println(teste);
		
		
		
	}
	
}
