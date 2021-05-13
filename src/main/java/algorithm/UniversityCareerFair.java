package algorithm;

import java.util.*;

/**
 * https://leetcode.com/discuss/interview-question/374846/Twitter-or-OA-2019-or-University-Career-Fair/338400
 */
public class UniversityCareerFair {

    public static void main(String[] args) {
        // int[] arrival = {1,3,5};
        // int[] duration = {2,2,2}; //Output will be 3

        // int[] arrival = {1, 2};
        // int[] duration = {7, 3}; // Output = 1

        // int[] arrival = {1, 3, 4, 6};
        // int[] duration = {4, 3, 3, 2}; // Output = 2

         int[] arrival = {1,3,3,5,7};
         int[] duration = {2,2,1,2,1}; // Output = 4

        // int[] arrival = {1,3,5};
        // int[] duration = {2,2, 2}; // Output = 3
        System.out.println("Input will be Array The output will be:" + maxEvents(arrival, duration));

        List<Integer> arrivalList = Arrays.asList(1,3,3,5,7);
        List<Integer> durationList = Arrays.asList(2,2,1,2,1); // Output = 4

//        List<Integer> arrivalList = Arrays.asList(1,3,5);
//        List<Integer> durationList = Arrays.asList(2,2,2);
        System.out.println("Input will be List The output will be:" + maxEvents(arrivalList, durationList));
    }

    private static int maxEvents(int[] arrival, int[] duration) {
        int maxEvents = 1;
        int maxTime = arrival[0] + duration[0];
        for(int i = 1; i < arrival.length; i ++) {
            if (arrival[i] < maxTime) continue;
            maxTime = arrival[i] + duration[i];
            maxEvents++;
        }
        return maxEvents;
    }

    private static int maxEvents(List<Integer> arrival, List<Integer> duration) {
        int maxEvents = 1;
        int maxTime = arrival.get(0) + duration.get(0);
        for(int i=1; i < arrival.size(); i++) {
            if(arrival.get(i) < maxTime) continue;;
            maxTime = arrival.get(i) + duration.get(i);
            maxEvents++;
        }
        return maxEvents;
    }
}
