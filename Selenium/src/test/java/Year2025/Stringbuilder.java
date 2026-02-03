package Year2025;

import java.util.Scanner;

public class Stringbuilder {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        StringBuilder sb=new StringBuilder(name);
        //delete function
        System.out.println(sb.delete(4,5));  //6 will be exclusive

//        insert function
        System.out.println(sb.insert(3,"ki"));

       // System.out.println(sb.insert(2,true));

        //append function
//        System.out.println(sb.append(" hi"));

  //      System.out.println(sb.lastIndexOf("k"));

      //  System.out.println(sb.indexOf("l",2));

        System.out.println(sb);



    }
}
