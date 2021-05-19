package algorithm.stringprocessing;

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

    private static void reverseCharacters() {
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
        System.out.println(new String(charArr));
    }

    public static void main(String[] args) {
        reverseWords();
        reverseCharacters();
    }
}
