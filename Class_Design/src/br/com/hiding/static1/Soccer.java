package br.com.hiding.static1;

public class Soccer extends Game {

	public void play() {
		System.out.println("Playing Soccer...");
	}

	public static void main(String[] args) throws Exception { 
		Game g = new Soccer(); 
		g.play();// this will use the override method, but use the method before, then is necessary put the try catch.
	}
}

class Game {
	public void play() throws Exception {
		System.out.println("Playing...");
	}
}
