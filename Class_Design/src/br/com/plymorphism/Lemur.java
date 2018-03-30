package br.com.plymorphism;

public class Lemur extends Primate implements HasTail {
	public int age = 10;

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());

		Primate primate = lemur;
		System.out.println(primate.hasHair());
		lemur = (Lemur) primate;
		Object obj = lemur;
		if (lemur instanceof LemurPlus) {
			LemurPlus lemurPlus = (LemurPlus) lemur; // not possible -> Class
														// cast exception
			lemurPlus.speak();
		}
		Lemur lemur1 = new LemurPlus();
		double x = 10;
		int y= (int) x;
		boolean k = true;
		//y = (int) k;
		//String l=(String) k;
		byte ll =(byte) y;
		StringBuilder pp = new StringBuilder("rrrr");
		//String l = (String) pp;
	}

	@Override
	public boolean isTailStriped() {
		return false;
	}

}

// -----------------------
class Primate {
	public boolean hasHair() {
		return true;
	}
}

// -----------------------
interface HasTail {
	public boolean isTailStriped();
}

class LemurPlus extends Lemur {
	public void speak() {
		System.out.println("Speaking....");
	}

	public int weight = 100;
}
