package GopalPracticePkg;

import java.util.Scanner;

public class TestNumberIsPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //12121   //12121 by converting into String
//        int number = sc.nextInt();
//        String strNum = String.valueOf(number);
//        String reverse = "";
//        for (int i = strNum.length() - 1; i >= 0; i--) {
//            reverse += strNum.charAt(i);
//        }
//        if(strNum.equals(reverse)){
//            System.out.println("Number is palindrome");
//        }else{
//            System.out.println("Number is not Palindrome");
//        }

        int number = sc.nextInt();
        int reverse = 0;

        while(number!=0){

            int digit = number%10;
            reverse = reverse *10 + digit;

            number = number /10;
            System.out.println(reverse);




        }

        if (reverse == number){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }






    }

}

