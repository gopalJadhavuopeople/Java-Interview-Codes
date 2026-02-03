package Year2026.JanStudy;

import java.util.HashMap;
import java.util.Map;

public class HashMapEX01 {


    public static void main(String[] args) {

        String str = "automation testing java automation";
        //count the frequency of each word

       String[] words = str.split(" ");//spit each word

        HashMap<String,Integer> listOfWord = new HashMap<>();

        for(String word :words){

            if(listOfWord.containsKey(word)){
                //if word already exist
                listOfWord.put(word,listOfWord.getOrDefault(word,0)+1);

            }else{
                //if word not exist
                listOfWord.put(word,1);
            }



        }


        System.out.println(listOfWord);
        //print word whose count greater than 1

       for(Map.Entry<String,Integer> entry :listOfWord.entrySet()){
           if(entry.getValue() >1){
               System.out.println(entry.getKey() + " - " +entry.getValue());

           }
       }




    }
}
