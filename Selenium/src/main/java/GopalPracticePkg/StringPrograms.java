package GopalPracticePkg;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class StringPrograms {

    public static void main(String[] args) {
        String name = "Gopal jadhav is from jalgaon district";

        StringPrograms ob = new StringPrograms();
        //ob.reverseString(name);
        // ob.reverseWordofString(name);
        //System.out.println(ob.countOfWordsInString(name));
        ob.countFrequencyOfCharacters(name);



    }

    public void reverseString(String input) {

        char[] chars = input.toCharArray();

        System.out.println("Reverse string : ");

        for (int i = chars.length - 1; i >= 0; i--) {

            System.out.print(chars[i]);

        }

    }

    public void reverseWordofString(String input) {

        String[] strArray = input.split(" ");

        System.out.println("Reverse word : ");

        for (int i = strArray.length - 1; i >= 0; i--) {

            System.out.print(strArray[i] + " ");

        }


    }

    public int countOfWordsInString(String input) {

        String[] strArray = input.split(" ");

        return strArray.length;

        //System.out.println("count of words : " +strArray.length);


    }

    public void countFrequencyOfCharacters(String input) {

        String strNew = input.toLowerCase().replace(" ", "");

        char[] chars = strNew.toCharArray();

        Map<Character, Integer> countOfChars = new HashMap<>();

        for (char c : chars) {
            countOfChars.put(c, countOfChars.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> count : countOfChars.entrySet()) {

            System.out.println(count.getKey() + " = " + count.getValue());
        }

    }
}
