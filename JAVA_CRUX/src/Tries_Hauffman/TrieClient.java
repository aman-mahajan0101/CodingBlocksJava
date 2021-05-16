package Tries_Hauffman;

public class TrieClient {

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.addWord("art");
		trie.addWord("arts");
		trie.addWord("bug");
		trie.addWord("boy");
		trie.addWord("sea");
		trie.addWord("see");
		trie.addWord("seen");
		trie.addWord("amit");
		trie.display();
		System.out.println("--------------------");

		System.out.println(trie.search("amit"));

		System.out.println("----------------------");

		trie.remove("amit");
		trie.display();
		System.out.println(trie.numWords());
	}

}
