package br.com.interview.prime.hashtables;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;

	public RansomNote(String magazine, String note) {
		magazineMap = new HashMap<String, Integer>();
		noteMap = new HashMap<String, Integer>();
		String[] wordsMagazine = magazine.split(" ");
		String[] wordsNoteMap = note.split(" ");

		for (String word : wordsMagazine) {
			Integer oldValue = magazineMap.put(word, 1);
			if (oldValue != null)
				magazineMap.put(word, ++oldValue);
		}
		for (String word : wordsNoteMap) {
			Integer oldValue = noteMap.put(word, 1);
			if (oldValue != null)
				noteMap.put(word, ++oldValue);
		}

	}

	public boolean solve() {
		for (String chave: noteMap.keySet()) {
			Integer occurs = magazineMap.get(chave);
			if ((occurs!=null) && (occurs>=noteMap.get(chave))){
				
			}else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int m = 6;
		int n = 5;

		RansomNote s = new RansomNote("give me one grand today night", "give one grand today");

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
