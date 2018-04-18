package br.com.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Override3  {
	public static void main(String[] args) throws Exception{
		Construct c = new House();
		c.build();
		
		Construct d = c;
		((Construct)new House()).build();
		d.build();
		House h = (House) c;
		h.build("e");
	}
}
class Construct{
	void build() throws IOException{
		System.out.println("Building ....");
	}
}
class House extends Construct{
	
	// private void build() { //dont permitted reduce visibility
	@Override
	public void build() throws FileNotFoundException { // permitted reduce hieararch of the Exception
		System.out.println("Building a house");
	}
	void build(String x) throws Exception {
		System.out.println("Building a house Overload");
	}
	
}
