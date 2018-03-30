package br.com.interview.string;

public class MakingAnagrams {
	public static int numberOccurs(String word, char guess) {
		int result=0;
		for (int index = word.indexOf(guess); index >= 0; index = word.indexOf(guess, index + 1)) {
			result++;
		}
		return result;
	}

	public static int numberNeeded(String first, String second) {
		boolean encontrou;
		int removidos = 0;
		StringBuilder novaPrimeira = new StringBuilder(first);
		StringBuilder novaSegunda = new StringBuilder(second);
		
		// Primeira Variavel
		for (int primeira = 0; primeira < novaPrimeira.length(); primeira++) {
			encontrou = false;
			for (int segunda = 0; segunda < novaSegunda.length(); segunda++) {
				if (novaPrimeira.charAt(primeira) == novaSegunda.charAt(segunda))
					encontrou = true;
			}
			if (encontrou == false) {
				novaPrimeira.deleteCharAt(primeira);
				primeira = -1;
				removidos++;
			}else {
				if (numberOccurs(novaPrimeira.toString(), novaPrimeira.charAt(primeira))>numberOccurs(novaSegunda.toString(), novaPrimeira.charAt(primeira))) {
					novaPrimeira.deleteCharAt(primeira);
					primeira = -1;
					removidos++;
				}
			}
		}

		// Segunda Variavel
		for (int segunda = 0; segunda < novaSegunda.length(); segunda++) {
			encontrou = false;
			for (int primeira = 0; primeira < novaPrimeira.length(); primeira++) {
				if (novaPrimeira.charAt(primeira) == novaSegunda.charAt(segunda))
					encontrou = true;
			}
			if (encontrou == false) {
				novaSegunda.deleteCharAt(segunda);
				segunda = -1;
				removidos++;
			}else {
				if (numberOccurs(novaSegunda.toString(), novaSegunda.charAt(segunda))>numberOccurs(novaPrimeira.toString(), novaSegunda.charAt(segunda))) {
					novaSegunda.deleteCharAt(segunda);
					segunda = -1;
					removidos++;
				}
			}
		}
		System.out.println(novaSegunda + "  " + novaPrimeira);
		System.out.println(novaSegunda.length() + "  " + novaPrimeira.length());
		
		//Outro Codigo
		int[] lettercounts = new int[26];
		for(char c : first.toCharArray()){
			lettercounts[c-'a']++;
		}
		for(char c : second.toCharArray()){
			lettercounts[c-'a']--;
		}
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		return result;
		
		//return removidos;
	}

	public static void main(String[] args) {

		String a = "fcrxzwscanmligyxyvym";
		String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		System.out.println(numberNeeded(a, b));
	}
}
