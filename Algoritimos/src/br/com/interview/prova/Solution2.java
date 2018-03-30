package br.com.interview.prova;

import java.util.Scanner;

public class Solution2 {

	static int minimumNumberOfTrips(int tripMaxWeight, int[] packagesWeight) {
		int trips = 0;
		int maxValue = 99999999;
		for (int x = 0; x < packagesWeight.length; ) {
			int PesoAntes = packagesWeight[x];
			packagesWeight = removeElement(packagesWeight, x);
			if (PesoAntes >= tripMaxWeight) {
				trips++;
				break;
			}
			int resposta = maxValue;
			int respostaAnterior = maxValue;
			int numeroIndice = maxValue;
			for (int y = 0; y < packagesWeight.length; y++) {
				resposta = (100 - (PesoAntes + packagesWeight[y])) < 0 ? maxValue
						: (100 - (PesoAntes + packagesWeight[y]));
				if (resposta == 0) {
					numeroIndice = y;
					break;
				} else {
					if (resposta < respostaAnterior) {
						respostaAnterior = resposta;
						numeroIndice = y;
					}
				}

			}
			trips++;
			if (resposta != maxValue) {
				packagesWeight = removeElement(packagesWeight, numeroIndice);
				x=0;
				if (packagesWeight.length==1) {
					trips++;
					break;
				}
			}

		}

		return trips;
	}

	private static int[] removeElement(int[]original, int element) {
		//System.arraycopy(a, del + 1, a, del, a.length - 1 - del);
		  int[] n = new int[original.length - 1];
		    System.arraycopy(original, 0, n, 0, element );
		    System.arraycopy(original, element+1, n, element, original.length - element-1);
		    return n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int tripMaxWeight = 100;
		int numberOfPackages = 4;

		int[] packagesWeight = { 70, 10, 20,100};

		int minimumNumberOfTrips = minimumNumberOfTrips(tripMaxWeight, packagesWeight);

		System.out.println(minimumNumberOfTrips);
	}

}
