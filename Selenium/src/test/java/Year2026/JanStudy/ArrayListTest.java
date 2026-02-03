package Year2026.JanStudy;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(15);
        numbers.add(40);

        //print the list
        System.out.println("Initial List : " + numbers);

        //remove all numbers >25

     for(int i = numbers.size()-1; i>=0; i--){
         if(numbers.get(i)>25){
             numbers.remove(i);
         }
     }

        System.out.println("after removal >25 : " + numbers);

     //Replace all occurrences of 15 with 50

        int index = numbers.indexOf(15);


        numbers.set(index,50);

        System.out.println("replace 15 to 50 : " + numbers);

        //




    }
}
