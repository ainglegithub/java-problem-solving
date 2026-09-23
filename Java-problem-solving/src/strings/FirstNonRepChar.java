package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepChar {

    static void main() {

        String str = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("First NonRepeating Character: " + ch);
                break;
            }
//            if (map.getOrDefault(ch, 0) == 1) {
//                System.out.println(ch);
//                break;
//            }
        }

    }
}
