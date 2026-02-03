package GopalPracticePkg;

import java.util.HashMap;
import java.util.Map;

public class countstringChar {

    public static void main(String[] args) {
        String input = "i love my india";

        char[] chars =input.toCharArray();

        Map<Character, Integer> countOfChar = new HashMap<>();

        for(char c :chars){

            countOfChar.put( c ,countOfChar.getOrDefault(c,0)+1);

        }

        for(Map.Entry<Character,Integer > charCount:countOfChar.entrySet()){

            System.out.println(charCount.getKey() +" " + charCount.getValue());

        }

    }
}
