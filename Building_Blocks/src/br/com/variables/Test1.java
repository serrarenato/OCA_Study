package br.com.variables;

public class Test1 {
	public static void main(String[] args) {
		String mStr = "123";
		System.out.println(Long.valueOf(mStr)); //Return Long (Wrapper)
		System.out.println(Long.parseLong(mStr)); //return long
		if (Long.valueOf(mStr) instanceof Long) {
			System.out.println("Long value");
		}
		Long x,j,ll,tt;
		x=j=ll=tt=10L;
		if (x instanceof Long) {
			System.out.println("Long value");
		}
			
	}
}
