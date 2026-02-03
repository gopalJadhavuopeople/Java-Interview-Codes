package integers;

public class fibonaaciSeries {

    public static void main(String[] args) {

      int first=0; int second=1;

      for(int i=0; i<10; i++)
      {
          System.out.print(first+" "); //0,1,
          int next=first+second;    //2
          first=second;         //1,1
          second=next;      //2
      }
    }
}
