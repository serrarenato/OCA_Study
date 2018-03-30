package br.com.lambda;

import java.util.ArrayList;
import java.util.List;

public class WithLambda {
	public static void main(String[] args) {
		List<Animal> animals= new ArrayList<>();
		animals.add(new Animal ("dogs",true, true));
		animals.add(new Animal ("cats",true, false));
		animals.add(new Animal ("whales",false, true));
		System.out.println("-----------------Hop");
		print (animals, b->b.canHop());
		System.out.println("");
		System.out.println("--------------------Swim");
		print (animals, a->a.canSwim());
		System.out.println("");
		System.out.println("--------------------teste");
		print (animals, a->false);
	//	print (animals, a->{if (a.startsWith("test"))			return true;		});
	}

	private static void print(List<Animal> animals, TestCheck testCheck) {
		
		for (Animal animal:animals){
			if (testCheck.check(animal))
				System.out.print(" " +animal.toString());
		}
	}
	
}
