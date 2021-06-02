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
//            revNum = revNum * 10 + input % 10;
            revNum = revNum * 10;
            revNum += input % 10; // get the last digit 12.1= 1
            input /= 10;
        }
        return input == revNum || input == revNum / 10;
    }

    public static void main(String[] args) {
        int input = 1212;
        System.out.println(palindromeIndex(input));
    }
}
