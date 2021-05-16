package Tries_Hauffman;

import java.util.BitSet;

public class huffmanClient {

	public static void main(String[] args) {
		String str = "abbccda";
		HuffmanEncoder hf = new HuffmanEncoder(str);
		String codedString = hf.encode(str);
		System.out.println(codedString);

		String output = hf.decode(codedString);

		System.out.println(output);

		BitSet bitset = new BitSet(codedString.length());
		int bitcounter = 0;
		for (Character c : codedString.toCharArray()) {
			if (c.equals('1')) {
				bitset.set(bitcounter);
			}
			bitcounter++;
		}

		byte[] arr = bitset.toByteArray();
		System.out.println(arr.length);
	}

}
