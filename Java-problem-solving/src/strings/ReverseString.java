package strings;

public class ReverseString {

    static void main(String[] args) {
        String str = "ReverseString";
        //1
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Output - " + reverse);

        //2
        char[] array = str.toCharArray();
        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            char temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l++;
            r--;
        }
        str = new String(array);
        System.out.println("Output - " + str);
    }
}


