package br.com.lambda.study;

public class LambdaDemo2 {

	public static void main(String[] args) {
		 NumericTest isEven = a->(a % 2)==0?true:false;
		 System.out.println(isEven.teste(7));
		 System.out.println(isEven.teste(6));
		 NumericTest isPositive = a-> (a>0)?true:false;
		 System.out.println(isPositive.teste(7));
		 System.out.println(isPositive.teste(-6));
	}


}
interface NumericTest{
	boolean teste(int x);
}
