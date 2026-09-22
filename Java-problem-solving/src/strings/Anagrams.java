package strings;

import java.util.Arrays;

public class Anagrams {
    static void main() {
        String str1 = "listen";
        String str2 = "silent";
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        //1
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        //2
        int[] freq = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        boolean isAnagram = true;
        for (int count : freq) {
            if (count != 0) {
                isAnagram = false;
            }
        }
        System.out.println(isAnagram ? "Anagram" : "Not Anagram");
    }
}
