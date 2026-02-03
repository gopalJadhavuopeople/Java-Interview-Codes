package Year2026.JanStudy;

public class ExceptionsHandling {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

       try{
           int div = a/b;
           System.out.println(div);
       }catch (ArithmeticException e){
           System.out.println(e.getMessage() + "= Numbers can not be divide by zeo");
       }

    }
}
