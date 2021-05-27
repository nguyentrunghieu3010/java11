package algorithm.leetcode;

/**
 * 7. Reverse Integer
 */
public class ReverseInteger {

    public static int reverseInteger(int x) {
        int rev = 0;
        while(x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

//        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
//            return 0;
//        } else {
//            return (int)rev;
//        }
        return (int) rev == rev ? (int) rev : 0;
    }

    public static void main(String[] args) {
        int input1 = -123;
        System.out.println("Output1 :" + reverseInteger(input1));
    }
}
