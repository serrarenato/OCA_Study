package br.com.lambda.study;

import java.time.LocalDateTime;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("renato");
		
		Consumer<Usuario> AtivacaoUsuario = u ->{
			u.setActive(true);
			u.setDateActive(LocalDateTime.now());
		};
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		u1.setName("Renato");
		u2.setName("Juliano");
		System.out.println(u1);
		System.out.println(u2);
		AtivacaoUsuario.accept(u1);
		AtivacaoUsuario.accept(u2);
		System.out.println(u1);		
		System.out.println(u2);
	}
}

class Usuario {
	private String name;
	private boolean active;
	private LocalDateTime dateActive;
	
	public LocalDateTime getDateActive() {
		return dateActive;
	}

	public void setDateActive(LocalDateTime dateActive) {
		this.dateActive = dateActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {	
		return "Name: "+ name + " Active: " + active + " DateActive: " + dateActive;
	}

}