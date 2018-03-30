package br.com.variables;

public class Variables {
	static int  b=30;
	public int xx;
	static boolean xxx;
	static public  long main(String[] args) {
		b=20;
		Sample somar1 = a-> {
			return a+b;
		};
		System.out.println(somar1.sum(10));
		b=10;
		System.out.println(somar1.sum(10));
		int c=60;
		Sample somar2= a-> {
			return a+c;
		};
		//c=10; not build not is final 
		System.out.println(somar2.sum(2));
		Variables variables= new Variables();
		variables.xx=40;
		
		//boolean t= new boolean("//rere");
		System.out.println(new Boolean("true"));
		System.out.println(Boolean.parseBoolean("true"));
		//boolean t= new boolean("//rere");
	
		System.out.println(xxx);
		
		
		Sample somar3= a-> {
			return a+variables.xx;
		};
		System.out.println(somar3.sum(10));
		return variables.xx=10;
			
	}
}

interface Sample{
	public int sum (int x);
}
