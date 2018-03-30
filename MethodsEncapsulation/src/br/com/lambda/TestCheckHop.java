package br.com.lambda;

public class TestCheckHop implements TestCheck{

	@Override
	public boolean check(Animal animal) {
		if (animal.canHop())
			return true;
		return false;
	}

}
