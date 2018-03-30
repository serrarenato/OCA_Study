package br.com.string;

class Baap {
	public int h = 5;

	public int getH() {
		System.out.println("Baap " + h);
		return h;
	}
}

public class Beta extends Baap {
	public int h = 47;

	public int getH() {
		System.out.println("Beta " + h);
		return h;
	}

	public static void main(String[] args) {
		Baap b = new Beta();
		Beta bb1 = new Beta();
		System.out.println(b.h + " " + bb1.getZ());//4 Beta 44
		System.out.println(b.h + " " + b.getH());//4 Beta 44
		
		Beta bb = (Beta) b;
		System.out.println(bb.h + " " + bb.getH()); //4 Beta 4
	}
	public int getZ() {
		System.out.println("rerer");
		return 9;
	}
}
