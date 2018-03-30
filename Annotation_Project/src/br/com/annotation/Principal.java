package br.com.annotation;
@Teste(nome = "Renato", numero = 5)
public class Principal {
	public static void main(String[] args) {
		Class<Principal> principal = Principal.class;
		if (principal.isAnnotationPresent(Teste.class)){
			Teste teste = principal.getAnnotation(Teste.class);
			System.out.println(teste.nome());
			System.out.println(teste.numero());
		}
	}
}
