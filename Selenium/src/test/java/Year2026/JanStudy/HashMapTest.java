package Year2026.JanStudy;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Amol");

        students.put(101, "Amol");//avoid duplicate value add


        students.put(102, "Amol");

        students.put(103, "Rupali");

        students.put(104, "Priyanka");


        students.remove(104, "Rupali");

        System.out.println(students);

        Set listOfStudents =students.keySet();

        System.out.println(listOfStudents);

        students.values();




    }
}
