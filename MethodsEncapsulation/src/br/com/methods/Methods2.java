package br.com.methods;

public class Methods2 {
	public int teste(){
		return 1; // null is not permited
	}
	public String teste2(){
		int x=5;
		//x= null; primitives dont be null.
		return null;
	}
	public int teste3(){
		//return 3.0; dont permited
		// return ; dont permited
		
		return 1;
		
	}
	public int howMany(boolean b, boolean... b2) {  return b2.length; }
	{
		howMany(true,new boolean[]{true,true});
	}
}
