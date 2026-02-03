package GopalPracticePkg;

public class StringImmutable {

    public static void main(String[] args) {
        //An immutable object is one whose state (value) cannot be changed after it is created.

        String s1 = "Gopal";
        s1 =s1.concat("Jadhav");
       // System.out.println(s1);

        String a ="java";
        String b ="java";
        //StringBuilder is mutable → can be modified in the same object.
        //Faster than String and StringBuffer because it is not synchronized (no thread safety).
        StringBuilder sb = new StringBuilder("Gopal");
        sb.append("Jadhav");
        //System.out.println(sb);
        //Also mutable like StringBuilder.
        //But it is synchronized, meaning multiple threads can use it safely.
        //Slightly slower than StringBuilder because of synchronization overhead.
        StringBuffer sb1 = new StringBuffer("Gopal");
        sb1.append("Sunil Jadhav");
        System.out.println(sb1);

    }
}
