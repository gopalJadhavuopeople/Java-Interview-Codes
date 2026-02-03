package String;

public class additionOfNumberFromString {

    public static void main(String[] args) {

        /*********Calculate Number directly*****/
      /*  //output=24;
        String name="kiran12Kiran12";

       String[] input=name.split("\\D+");

       int sum=0;

       for(String num:input)
       {
           if(!num.isEmpty())
           {
               sum=sum+Integer.parseInt(num);
           }
       }

        System.out.println(sum);*/

       /********Calculate the sum of single integer*****/

       String name="kiran12Kiran12";

       int sum=0;

       for(int i=0; i<name.length(); i++)
        {
            char ch=name.charAt(i);

            if(Character.isDigit(ch))
            {
                sum=sum+Integer.parseInt(String.valueOf(ch));
            }

        }


        System.out.println(sum);
    }
}
