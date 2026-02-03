package String;

import java.util.ArrayList;
import java.util.Arrays;

public class toCheckStringIsAnagram {

    public static void main(String[] args) {
        String inputOne="kiran";

        String inputTwo="narik";

        char[] one =inputOne.toCharArray();
        char[] two =inputTwo.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        if(one.length==two.length && Arrays.equals(one,two))
        {
                System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }

    }
}
