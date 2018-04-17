package br.com.string;

public class String3 {
	static String super_reduced_string(String s) {
		String retorno = new String();
		StringBuilder sb = new StringBuilder(s);
		for (int x=1;x<sb.length();x++) {
			if (sb.charAt(x) == sb.charAt(x-1)) {
				sb.deleteCharAt(x);
				sb.deleteCharAt(x-1);
				x=0;	
			}
				
		}
		retorno = sb.toString();
		if (retorno.isEmpty())
			retorno = "Empty String";
		return retorno;
	}
	public static char[] caracteres(String s) {
	
		String nova;
		for (int x=0;x<s.length();x++) {
			//nova = s.replace(s.charAt(x), '');
			
			for (int y=0;y<s.length();y++) {{
				
			}
				
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		String s = "aaabccddd";
		String result = super_reduced_string(s);
		System.out.println(result);
	}

}
