package algorithm.stringprocessing;

public class StringConstruction {


    private static int stringConstruction(String input) {
        if(input.length()<= 1) return input.length();
        return (int) input.chars().distinct().count();
    }

    public static void main(String[] args) {

        // Input: abab => Ouput: 2
        // Input: abcd => Ouput: 4
        System.out.println("My input:" + stringConstruction("aaaaaa"));
    }
}
