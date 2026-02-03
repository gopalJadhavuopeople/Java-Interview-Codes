package Year2026.JanStudy;

import java.util.HashMap;
import java.util.Map;

public class HashMapEX02 {
    public static void main(String[] args) {
        //count the frequency of each number

        int[] nums = {4, 5, 4, 6, 5, 4, 7, 6, 7, 8};


        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int n : nums) {
            if (numbers.containsKey(n)) {

                numbers.put(n, numbers.getOrDefault(n, 0) + 1);


            } else {
                numbers.put(n, 1);
            }

        }
        //System.out.println(numbers);

        //find the max frequency

        int maxFreq = 0;
        for (int freq : numbers.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }

        }


        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {

            if (entry.getValue() == maxFreq) {

                System.out.println(entry.getKey() + " = " + entry.getValue());


            }

        }


    }
}
