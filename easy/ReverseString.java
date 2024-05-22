package easy;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        char[] hannah = {'H','a','n','n','a','h'};

        System.out.println(reverseString(hello));
        System.out.println(reverseString(hannah));
    }

    private static String reverseString(char[] s) {
        int ultimoIndex = s.length;

        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[--ultimoIndex];
            s[ultimoIndex] = temp;
        }
        return Arrays.toString(s);
    }

}
