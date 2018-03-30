package br.com.searching;

import java.util.Arrays;
import java.util.Scanner;

/*
 * In this class I will do if binary search of java.
 */
public class IceCream3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int trips = in.nextInt();
		for (int i = 0; i < trips; i++) {
			int money = in.nextInt();
			int qtdFlavors = in.nextInt();
			IceCreamType[] flavors = new IceCream3.IceCreamType[qtdFlavors];
			for (int ii = 0; ii < qtdFlavors; ii++) {
				IceCreamType iceCream = new IceCream3().new IceCreamType();
				iceCream.value = in.nextInt();
				iceCream.id = ii + 1;
				flavors[ii] = iceCream;
			}
			System.out.println(chooseFlavor(flavors, money));
		}
		in.close();
	}

	private static String chooseFlavor(IceCreamType[] flavors, int money) {
		String chooseFlavor = new String();
		Arrays.sort(flavors);
		for (int i = 0; i < flavors.length; i++) {
			int valuetoSeek = money - flavors[i].value;
			IceCreamType iceCreamType = new IceCream3().new IceCreamType();
			iceCreamType.value = valuetoSeek;
			// Nao tem como usar este binarySearch do java pois ele não aceita parametro de start entao ele pega o mesmo parametro novamente, além de nao ser performatico por esse motivo.
			//   int index = binarySearch(i + 1, n - 1, search);
			int index = Arrays.binarySearch(flavors, iceCreamType); 
			if (index >= 0) {
				if (flavors[i ].id<  flavors[index].id)
					chooseFlavor =  flavors[i ].id  + " " + flavors[index].id;
				else
					chooseFlavor =  flavors[index ].id  + " " + flavors[i].id;
				break;
			}
		}
		return chooseFlavor;
	}

	class IceCreamType implements Comparable<IceCreamType> {
		Integer id;
		int value;

		public IceCreamType() {
			super();
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + value;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			IceCreamType other = (IceCreamType) obj;
			if (id != other.id)
				return false;
			if (value != other.value)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "IceCreamType [id=" + id + ", value=" + value + "]";
		}

		@Override
		public int compareTo(IceCreamType o) {

			return this.value - o.value;
		}

	}
}
