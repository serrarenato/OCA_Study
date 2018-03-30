package br.com.lambda.study;

public class Test {
	interface Sample<T>{ void print(T t) throws NotValidString; }
	public static void main(String[] args) throws NotValidString { 
		Sample sample1=( a)->{
			if (!(a instanceof String))
				throw new NotValidString();			
				
			if (((String) a).length()==0)
				throw new NotValidString();
			else
				System.out.println(a.toString());
		};
		sample1.print("renato");
		sample1.print(4);
		
	}
	
}
class NotValidString extends Exception{}
