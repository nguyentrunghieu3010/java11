package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1487. Making File Names Unique
 *
 * <p>Example 1:
 *
 * <p>Input: names = ["pes","fifa","gta","pes(2019)"] Output: ["pes","fifa","gta","pes(2019)"]
 * Explanation: Let's see how the file system creates folder names: "pes" --> not assigned before,
 * remains "pes" "fifa" --> not assigned before, remains "fifa" "gta" --> not assigned before,
 * remains "gta" "pes(2019)" --> not assigned before, remains "pes(2019)"
 */
public class MakingFileNamesUnique {

    public static void main(String[] args) {
//        String[] names = {"gta","gta(1)","gta","avalon"}; // Output: ["gta","gta(1)","gta(2)","avalon"]
//        String[] names = {"onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"}; // Output: ["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece(4)"]
        String[] names = {"kaido","kaido(1)","kaido","kaido(1)"}; // Output: ["kaido","kaido(1)","kaido(2)","kaido(1)(1)"]
        System.out.println("------Solution 01------");
        for (String folderName : getFolderNames1(names)) {
          System.out.println(folderName);
        }
        System.out.println("------Solution 02------");
        for (String folderName : getFolderNames2(names)) {
            System.out.println(folderName);
        }
    }

    /**
     * Best solution
     *
     * @param names
     * @return
     */
    public static String[] getFolderNames1(String[] names) {
        Map<String,Integer> mapCounter = new HashMap<>();
        String[] myOutput = new String[names.length];
        for(int i=0;i<names.length;i++){
            String name = names[i];
            int counter = mapCounter.getOrDefault(names[i],0);
            while(mapCounter.containsKey(name)) {
                counter++;
                name = names[i]+"("+ counter +")";
            }
            mapCounter.put(names[i],counter);
            if(counter > 0) mapCounter.put(name,0);
            myOutput[i]=name;
        }
        return myOutput;
    }

    public static String[] getFolderNames2(String[] names) {
        String[] output = new String [names.length]; // Initialize the output array
        Map<String, Integer> mapCheckDuplicate = new HashMap<>(); // remove duplicate key
        for(int i=0; i<names.length; i++) {
            if(mapCheckDuplicate.containsKey(names[i])) { // Find out duplicate from the arrays of names[]
                int countValue = mapCheckDuplicate.get(names[i]); //first time count will be 1
                String tempOutput = names[i] + "(" + countValue +")";
                while (mapCheckDuplicate.containsKey(tempOutput)) { // find duplicate from the map
                    countValue++;
                    tempOutput = names[i] + "(" + countValue +")";
                }
                mapCheckDuplicate.put(tempOutput, 1);
                mapCheckDuplicate.put(names[i], countValue);
                output[i] = tempOutput;
            } else {
                output[i] = names[i];
                mapCheckDuplicate.put(output[i],1);
            }
        }
        return output;
    }
}
