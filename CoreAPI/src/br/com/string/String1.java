package br.com.string;

public class String1 {
 public static void main(String[] args) {
	String x="teste";
	System.out.println(x.substring(0));
	System.out.println(x.substring(0,5));
	System.out.println(x.substring(0,4));
	System.out.println(x.substring(1,1));
	String x1="teste";
	System.out.println(x==x1);
	System.out.println(x==x1.toLowerCase());
	String x2= new String ("teste"); //create a new String
	
	System.out.println(x==x2);
	 x1=" teste".trim(); //create a new String
	 System.out.println(x==x1);
	 String a="ab";
	 String b= "a" +"b";	 
	 System.out.println(a==b);
	 b="ab";
	 System.out.println(a==b.toLowerCase());
	 System.out.println(a==b.toString());
}
}
