package String;

import java.sql.SQLOutput;

public class replacewhiteSpacesString {


    public static void main(String[] args) {
        String demo="demo     demo   demo";

        System.out.println(demo.replaceAll("\\s+"," "));
    }
}
