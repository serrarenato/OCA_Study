package br.com.override;

public class Beaver extends Rodent {
	
	public static Integer chew() throws RuntimeException { // Not is possible let without static. 
		System.out.println("Beaver is chewing on wood");
		return 2;
	}
}
