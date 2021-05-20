package algorithm.stringprocessing;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringReverse {

    /**
     * Not use API support "Strinbuilder"
     */
    private static void reverseWords() {
        String input = "Nguyen Trung Hieu";
        String[] wordArr = input.split(" ");
        for(int i = (wordArr.length - 1); i>=0; i--) { // Reverse count
            System.out.println(wordArr[i]);
        }
    }

    private static void reverseCharacters1() {
        String input = "Hello";
        char[] charArr = input.toCharArray();
        int i = 0;
        int j = charArr.length -1;
        while (i<j) {
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
            i++;
            j--;
        }
        System.out.println("reverseCharacters1: " + new String(charArr));
    }

    private static void reverseCharacters2() {
        String input = "Hello";
        byte[] bytes = input.getBytes();
        int i=0;
        int j=input.length() - 1;
        while(i < j) {
            byte temp = bytes[i];
            bytes[i] = bytes[j];
            bytes[j] = temp;
            i++;
            j--;
        }
        System.out.println("reverseCharacters2: " + new String(bytes));
    }

    private static void reverseCharacters3() {
        String input = "Hello";
        char[] strArr = input.toCharArray();
        int size = strArr.length-1;
        for(int i=0; i< (size/2); i++) {
            char temp = strArr[i];
            strArr[i] = strArr[size-i];
            strArr[size-i] = temp;
        }

        System.out.println("reverseCharacters3: " + new String(strArr));
    }

    public static void main(String[] args) {
        reverseWords();
        reverseCharacters1();
        reverseCharacters2();
        reverseCharacters3();
    }
}
