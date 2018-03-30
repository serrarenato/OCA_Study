package br.com.interview.trees;

import java.util.HashMap;

public class Tree {

	public static void main(String[] args) {
		String[] scan = {"add", "hack", "add", "hackerrank", "find", "hac", "find", "hak"};
		
		int n = 4;
		Trie trie = new Trie();
		for (int i = 0; i < scan.length; i+=2) {
			String operation = scan[i];
			String contact = scan[i+1];
			if (operation.equals("add")) {
				trie.add(contact);
			} else if (operation.equals("find")) {
				System.out.println(trie.find(contact));
			}
		}
		
	}
}

/* Based loosely on tutorial video in this problem */
class TrieNode {
	private HashMap<Character, TrieNode> children = new HashMap<>();
	public int size;

	public void putChildIfAbsent(char ch) {
		children.putIfAbsent(ch, new TrieNode());
	}

	public TrieNode getChild(char ch) {
		return children.get(ch);
	}
}

class Trie {
	TrieNode root = new TrieNode();

	Trie() {
	} // default constructor

	Trie(String[] words) {
		for (String word : words) {
			add(word);
		}
	}

	public void add(String str) {
		TrieNode curr = root;
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			curr.putChildIfAbsent(ch);
			curr = curr.getChild(ch);
			curr.size++;
		}
	}

	public int find(String prefix) {
		TrieNode curr = root;

		/* Traverse down tree to end of our prefix */
		for (int i = 0; i < prefix.length(); i++) {
			Character ch = prefix.charAt(i);
			curr = curr.getChild(ch);
			if (curr == null) {
				return 0;
			}
		}
		return curr.size;
	}
}
