package br.com.blocks;

public class BlockStatic {
	static int x = 2;
	static int z;
	int xx=4;
	int zz=5;
	{int xx=5;xx=1;}
	public static void main(String[] args) {
		System.out.println("X:" + x + " Z: " + z);
		BlockStatic bl = new BlockStatic();
		System.out.println("XX:" + bl.xx + " ZZ: " + bl.zz);
	}
	
	static {
		int x = 1;
		z = x;
	}
}
