package algorithm;

import java.util.*;

public class LongestPalindrome {

    private static int isLongestPalindrome(String input) {
        Map<Character, Integer> mapCountCharacters = new HashMap<>();
        for (char chr : input.toCharArray()) {
            mapCountCharacters.put(chr, mapCountCharacters.getOrDefault(chr, 0) + 1);
        }

        int result = 0;
        boolean isOdd = false;
        for(int mapValue: mapCountCharacters.values()) {
            if(mapValue % 2 ==0) result += mapValue;
            else {
                isOdd = true;
                result += mapValue - 1;
            }
        }
        if(isOdd) result++;
        return result;
    }


    public static void main(String[] args) {
//        System.out.println("Expected 7 = " + isLongestPalindrome("abccccdd"));
        System.out.println("Expected chsjavajdd 7 = " + isLongestPalindrome("chsjavajdd"));


    }
}
