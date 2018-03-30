package br.com.lambda;

import java.util.ArrayList;
import java.util.List;

public class WithoutLambda {
	public static void main(String[] args) {
		List<Animal> animals= new ArrayList<>();
		animals.add(new Animal ("dogs",true, true));
		animals.add(new Animal ("cats",true, false));
		animals.add(new Animal ("whales",false, true));
		System.out.println("-----------------Hop");
		print (animals, new TestCheckHop());
		System.out.println("--------------------Swim");
		print (animals, new TestCheckSwim());
	}

	private static void print(List<Animal> animals, TestCheck testCheck) {
		
		for (Animal animal:animals){
			if (testCheck.check(animal))
				System.out.println(animal.toString());
		}
	}
	
}
