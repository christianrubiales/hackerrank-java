package security.cryptography;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class KeywordTranspositionCipher {

	public static String removeDuplicates(String word) {
		Set<Character> set = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();
		
		for (Character c : word.toCharArray()) {
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
	
	public static Map<Character, Character> buildMap(String word) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		
		// create an array of lists of characters
		List<Character>[] array = new List[word.length()];
		for (int i = 0; i < word.length(); i++) {
			array[i] = new ArrayList<Character>();
			array[i].add(word.charAt(i));
		}
		
        // map of word characters to index in String
        Map<Character, Integer> wordIndex = new HashMap<Character, Integer>();
        for (int i = 0; i < word.length(); i++) {
            wordIndex.put(word.charAt(i), i);
        }
        
        // map the alphabet
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int i = 0;
        for (Character c : alphabet.toCharArray()) {
            if (!wordIndex.containsKey(c)) {
                array[i % array.length].add(c);
                i++;
            }
        }
        
        // sort then populate mapping
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        i = 0;
        for (Character c : chars) {
            int index = wordIndex.get(c);
            for (Character ch : array[index]) {
                map.put(ch, alphabet.charAt(i));
                i++;
            }
        }
		
		return map;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        for (int i = 0; i < n; i++) {
        	String keyword = removeDuplicates(in.nextLine());
        	String ciphertext = in.nextLine();
        	Map<Character, Character> map = buildMap(keyword);
            for (Character c : ciphertext.toCharArray()) {
                System.out.print(map.containsKey(c) ? map.get(c) : c);
            }
            System.out.println();
        }
    }
}
