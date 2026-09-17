package leetcode.easy;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String str = "Hello World   abc   ";  //"   fly me   to   the moon  " "luffy is still joyboy"
        int result = lengthOfLastWord(str);
        System.out.println("LengthOfLastWord: " + result);
    }

    private static int lengthOfLastWord(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int len = str.length() - 1;
        int count = 0;

        while (len >= 0 && str.charAt(len) == ' ') {
            len--;
        }

        while (len >= 0 && str.charAt(len) != ' ') {
            count++;
            len--;
        }
        return count;
    }

//    private static int lengthOfLastWord(String str) {
//        str = str.trim();
//        int index= str.lastIndexOf(" ");
//        return str.length() - index -1;
//    }

//    private static int lengthOfLastWord(String str) {
//        String[] strings =  str.split(" ");  //split("\\s+")
//        System.out.println(strings.length);
//        return strings[strings.length -1].length();
//    }

//    private static int lengthOfLastWord(String str) {
//        String[] strings =  str.split("\\s+");  //split("\\s+")
//        System.out.println(strings.length);
//        return strings[strings.length -1].length();
//    }
}
