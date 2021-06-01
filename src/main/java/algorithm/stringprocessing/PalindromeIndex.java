package algorithm.stringprocessing;

/**
 * 9. Palindrome Number
 */
public class PalindromeIndex {
    private static boolean palindromeIndex(int  input) {
        if(input < 0 || (input % 10 == 0 && input != 0)) {
            return false;
        }

        int revNum = 0;
        while(input > revNum) {
            revNum = revNum * 10 + input % 10;
            input /= 10;
        }
        return input == revNum || input == revNum / 10;
    }

    public static void main(String[] args) {
        int input = -121;
        System.out.println(palindromeIndex(input));
    }
}
