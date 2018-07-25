package main.java.org.spookymon.practice.migratorybirds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MigratoryBirds {

    static int getMostCommonBird(Map<Integer, Integer> frequencyMap) {
        int highestFrequency = 0;
        int id = -1;
        for(Map.Entry entry : frequencyMap.entrySet()) {
            int frequency = (int)entry.getValue();
            if(frequency > highestFrequency) {
                highestFrequency = frequency;
                id = (int)entry.getKey();
            }
        }
        return id;
    }

    static Map<Integer, Integer> initFrequenceyMap(Integer[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            Integer count = map.get(array[i]);
            if(count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(array[i], count);
        }
        return map;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/org/spookymon/practice/migratorybirds/test1.txt");
        System.out.println(file.getAbsolutePath());
        Scanner scan = new Scanner(file);
        List<Integer> list = new ArrayList<>();
        scan.useDelimiter(" ");
        while(scan.hasNext()) {
            list.add(scan.nextInt());
        }
        System.out.println(list.size());
        Integer[] newArray = new Integer[list.size()];
        Map<Integer, Integer> map = initFrequenceyMap(list.toArray(newArray));
        int id = getMostCommonBird(map);
        System.out.println(id);
    }
}
