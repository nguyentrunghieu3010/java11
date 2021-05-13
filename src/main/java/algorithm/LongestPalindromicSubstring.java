package algorithm;

import javax.swing.text.MaskFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Longest Palindromic Substring
 *
 * Given a string s, return the longest palindromic substring in s.
 *
 *  Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 * Example 3:
 *
 * Input: s = "a"
 * Output: "a"
 * Example 4:
 *
 * Input: s = "ac"
 * Output: "a"
 */

// tacocat => tacocat

public class LongestPalindromicSubstring {


    private static int isLongestPalindromeSubstring(String input) {
        int tot = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String sub = input.substring(i, j + 1);
                StringBuilder rsub = new StringBuilder(sub);
                if (sub.equals(rsub.reverse().toString())) {
                    tot++;
                    list.add(sub);
                }
            }
        }
        list.forEach(System.out::println);
        return tot;
    }

    /**
     *  chsjavajdd => javaj => This is the longest substring is Palindrome
     *
     * @param input
     * @return
     */
    private static String getTheLongestSubStringIsPalindrome(String input) {
        Map<Integer, String> mapCounter = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String extractString = input.substring(i, j + 1); // it will extract by character
                StringBuilder stringBuilder = new StringBuilder(extractString);
                if (extractString.equals(stringBuilder.reverse().toString())) { // check is Palindrome
                    mapCounter.put(extractString.length(), extractString);
                }
            }
        }
        Integer keyMap = mapCounter.keySet().stream().sorted(Comparator.reverseOrder()).findFirst().get();
        return mapCounter.get(keyMap);
    }

    /**
     * https://allhackerranksolutionsbykaira.blogspot.com/2020/08/sub-palindrome-hackerrank-solution.html
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("~~~My Output~~~~~");
//        mokkori
//        System.out.println("abcddcbabcdcdaadcdcbabcdddcb 27 = " + isLongestPalindrome("abcddcbabcdcdaadcdcbabcdddcb"));
//        System.out.println("aabaa 5 = " + isLongestPalindrome("aabaa"));
//        System.out.println("~~~Output:baab 8 = " + isLongestPalindromeSubstring("abaab"));
//        System.out.println("chsjavajdd 13 = " + isLongestPalindromeSubstring("chsjavajdd"));
//        System.out.println("javaj = " + getTheLongestSubStringIsPalindrome("chsjavajdd"));

        String input = "yzwhuvljgkbxonhkpnxldwkaiboqoflbotqamsxyglfqniflcrtsxbsxlwmxowwnnxychyrjedlijejqzsgwakzohghpxgamecmhcalfoyjtutxeciwqupwlxrgdcpfvybskrytvmwkvnbdjitmohjavhmjobudvbsnkvszyrahpanocltwzeubgxkkthxhjgvcvygfkjctkubtjdocncmjzmxujetybdwmqutvrrulhlsbcbripctbkacwoutkrqsohiihiegqqlasykkgjjskgphieofsjlkkmvwcltgjqbpakercxypfcqqsmkowmgjglbzbidapmqoitpzwhupliynjynsdfncaosrfegquetyfhfqohxytqhjxxpskpwxegmnnppnnmgexwpkspxxjhqtyxhoqfhfyteuqgefrsoacnfdsnyjnyilpuhwzptioqmpadibzblgjgmwokmsqqcfpyxcrekapbqjgtlcwvmkkljsfoeihpgksjjgkkysalqqgeihiihosqrktuowcakbtcpirbcbslhlurrvtuqmwdbytejuxmzjmcncodjtbuktcjkfgyvcvgjhxhtkkxgbuezwtlconapharyzsvknsbvdubojmhvajhomtijdbnvkwmvtyrksbyvfpcdgrxlwpuqwicextutjyoflachmcemagxphghozkawgszqjejildejryhcyxnnwwoxmwlxsbxstrclfinqflgyxsmaqtoblfoqobiakwdlxnpkhnoxbkgjlvuhwzy";
        System.out.println("baab = " + getTheLongestSubStringIsPalindrome(input));
    }
}
