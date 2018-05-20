package br.com.string;

public class StringBuilder4 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Renato");
		sb.append("teste");
		System.out.println(sb.indexOf("teste"));
		System.out.println(sb);
		sb.substring(4);
		System.out.println(sb.indexOf("teste"));
		System.out.println(sb);
		System.out.println("capacity:"+sb.capacity());
		sb.ensureCapacity(10);
		System.out.println("capacity:"+sb.capacity());
		sb.setLength(11);
		sb.ensureCapacity(15);
		System.out.println("capacity:"+sb.capacity());
		sb.trimToSize();
		System.out.println("capacity:"+sb.capacity());
		sb.ensureCapacity(18);
		System.out.println("capacity:"+sb.capacity()); // when I improve capacity its is no minimum old capacity *2 +2 then -> 11*2+2=24
		sb.ensureCapacity(300);
		System.out.println("capacity:"+sb.capacity());
	}
}
