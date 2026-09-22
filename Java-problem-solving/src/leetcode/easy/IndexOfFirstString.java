package leetcode.easy;

public class IndexOfFirstString {

    static void main() {
        String haystack = "asadbutsad";
        String needle = "but";

        int result = strStr(haystack, needle);
        System.out.println("Index :" + result);
    }


    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

//    public static int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }
}
