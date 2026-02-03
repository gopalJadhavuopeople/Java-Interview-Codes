package NavinAutomationJavaPrograms;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("before swaping a: " + a);
        System.out.println("before swaping b: " + b);

        //without using third variable

        a = a + b;//30
        b = a - b;//10
        a =  a-b;

        System.out.println("After swaping a: " + a);
        System.out.println("After swaping b: " + b);


    }
}