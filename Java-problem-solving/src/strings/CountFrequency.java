package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequency {

    static void main() {

        String str = "programming";

        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            int count = freq.getOrDefault(ch, 0) + 1;
            freq.put(ch, count);
        }
        System.out.println(freq);
    }
}
