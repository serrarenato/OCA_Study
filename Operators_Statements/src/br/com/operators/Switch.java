package br.com.operators;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Switch {
	public static void main(String args[]) {
		int data = 1;
		final int val = 2;

		switch (data) {
		default:
			System.out.println("re");
			break;
		case val:
			System.out.println("re2");
			break;
		case 3:
			System.out.println("re3");
			break;
		case 1:
			System.out.println("re1");
			break;
		}
		Integer p1 = 1;
		switch (p1) {
		//case "B": //	the values in each case must be the same type of the switch value
		//	System.out.println(p1);
		case 1:
			System.out.println(p1);
		}
	}
}
