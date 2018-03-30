package br.com.lambda;

public class TestCheckSwim implements TestCheck{

	@Override
	public boolean check(Animal animal) {
		if (animal.canSwim())
			return true;
		return false;
	}

}
