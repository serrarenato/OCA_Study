package br.com.string;

public class Test1 {

	public static void main(String[] args) {
		String myStr = "good";
		char[] myCharArr = { 'g', 'o', 'o', 'd' };

		String newStr = null;
		for (char ch : myCharArr) {
			newStr = newStr + ch;
		}
		System.out.println(newStr);
		System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));
		//////////////////////////////////////////////////////////////////////
		System.out.println("Testes com Hello");
		
		String hello = "Hello", lo = "lo";
		
		
		System.out.print((Other.hello == hello) + " "); // compile time
		System.out.print((Other.hello.substring(0, 3) + "lo" == hello) + " "); // runtime time
		System.out.print((hello == ("Hel" + "lo")) + " "); // compile time
		System.out.print((hello == ("Hel" + lo)) + " "); // always when use a String create in time execution it is a
															// new String
		System.out.println(hello == ("Hel" + lo).intern()); // intern always get of pull.
	}

}

class Other {
	static String hello = "Hello";
}