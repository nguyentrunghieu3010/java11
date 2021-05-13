package algorithm;

import java.util.*;

/**
 * Input: ['lamp', 'lamp', 'tv', 'lamp']
 *
 * Output: ['lamp', 'lamp1', 'tv', 'lamp2']
 */
public class DeviceNamesSystem {

    public static void main(String[] args) {

//      List<String> deviceNames = Arrays.asList("lamp", "tv", "lamp", "tv"); // "lamp", "tv", "lamp1", "tv1"
//      List<String> deviceNames = Arrays.asList("lamp", "tv", "lamp", "tv", "lamp", "tv"); // "lamp", "tv", "lamp1", "tv1", "lamp2", "tv2"
        List<String> deviceNames = Arrays.asList("lamp", "tv", "lamp1", "lamp1"); // "lamp", "tv", "lamp1", "lamp2"

        deviceNamesSystem(deviceNames).forEach(System.out::println);
    }

    public static List<String> deviceNamesSystem(List<String> deviceNames) {
        List<String> listOutput = new ArrayList<>();
        int index;
        Map<String, Integer> mapOccurrence = new HashMap<>(); // remove duplicate value
        for (String deviceItem: deviceNames) {
            if(mapOccurrence.containsKey(deviceItem)) {
                mapOccurrence.put(deviceItem, mapOccurrence.get(deviceItem) + 1);
                index = mapOccurrence.get(deviceItem);
                listOutput.add(deviceItem+index);
            } else {
                mapOccurrence.put(deviceItem,0);
                listOutput.add(deviceItem);
            }
        }
        return listOutput;
    }
}
