package integers;

import java.util.Scanner;

public class findAllArmStrongNumberTillGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startNumber = sc.nextInt();
        int endNumber = sc.nextInt();

        for (int num = startNumber; num < endNumber; num++)
        {

            int sameNum = num;
            int temp=num;

            int size = String.valueOf(num).length();

            int armstrongNumber = 0;

            while (temp != 0) {
                int b = temp % 10;            //to take the last value
                int digitPower = 1;
                for (int i = 0; i < size; i++)
                {
                    digitPower = digitPower * b;                       //to multiply the last value as per the size of int
                }

                armstrongNumber = armstrongNumber + digitPower;

                temp = temp / 10;
            }



            if (sameNum == armstrongNumber) {
                System.out.println(sameNum + " Number is armstrong");
            }

        }
    }


}