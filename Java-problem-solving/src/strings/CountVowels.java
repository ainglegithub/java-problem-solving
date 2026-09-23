package strings;

import java.util.Set;

public class CountVowels {
    static void main() {

        String str = "aeiouabc";  //Java Programming
        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        //1
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if ("aeiou".indexOf(str.charAt(i)) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels :" + vowels);
        System.out.println("Consonants :" + consonants);

        //2
        vowels = 0;
        consonants = 0;
        for (char ch : str.toCharArray()) {
            if (ch < 'a' || ch > 'z') {
                continue;
            }
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels :" + vowels);
        System.out.println("Consonants :" + consonants);

        //3
        Set<Character> vowelSet = Set.of('a', 'e', 'i', 'o', 'u');
        vowels = 0;
        consonants = 0;
        for (char ch : str.toCharArray()) {
            if (ch < 'a' || ch > 'z') {
                continue;
            }
            if (vowelSet.contains(ch)) {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels :" + vowels);
        System.out.println("Consonants :" + consonants);
    }
}
