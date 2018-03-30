package br.com.operators;

public class ParaguaiTeste {
	public static void main(String[] args) {
		int x=144;
		int y = (int) Math.sqrt(x);		
		if ((y*y)==x){
			y++;
			System.out.println(y*y);
		}else
			System.out.println(-1);
	}
}
