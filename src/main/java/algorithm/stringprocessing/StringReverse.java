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
            wordArr[i] = wordArr[i];
        }
//        System.out.print(Arrays.toString(wordArr));
        Arrays.stream(wordArr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        reverseWords();
    }
}
