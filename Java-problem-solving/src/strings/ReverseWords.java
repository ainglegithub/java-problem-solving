package strings;

import java.util.Arrays;

public class ReverseWords {
    static void main() {
        String str = "Java is powerful language";
        String[] arr = str.split("\\s");
        StringBuilder reverse = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse.append(arr[i]);
            if (i != 0) {
                reverse.append(" ");
            }
        }
        System.out.println(reverse);
    }
}
