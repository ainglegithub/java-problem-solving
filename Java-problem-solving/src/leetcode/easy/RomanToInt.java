package leetcode.easy;

public class RomanToInt {

    public static void main(String[] args) {
        String str = "VI"; //58 - LVIII   1994 -MCMXCIV  3 - III
        int result = romanToInt(str);
        System.out.println("RomanToInt: " + result);
    }

    private static int romanToInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int current = getValue(str.charAt(i));

            if (i + 1 < str.length()) {
                int next = getValue(str.charAt(i + 1));

                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }

            } else {
                return result += current;
            }
        }

        return result;
    }


    private static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }


}
