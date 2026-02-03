package GopalPracticePkg;


import java.sql.SQLOutput;

interface Greet{
    void say(int a , int b);
}

public class lambdaFunctions {

    public static void main(String[] args) {
        Greet grt = (a,b)-> System.out.println(a + b);
        grt.say(10,20);
    }
}
