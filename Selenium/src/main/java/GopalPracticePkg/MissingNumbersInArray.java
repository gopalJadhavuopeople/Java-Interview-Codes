package GopalPracticePkg;

public class MissingNumbersInArray {

    private int getMissingNumberInArray(int[] ar) {
        int length = ar.length;
        int sum = 0;
        int total;
        for (int i = 0; i <= ar.length - 1; i++) {

            sum = +ar[i];

        }

        total = sum + length;
        int missingNum = total - sum;
        System.out.println("Missing Numbers :" + missingNum);
        return missingNum;
    }




    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4,6};
        MissingNumbersInArray ob = new MissingNumbersInArray();
        ob.getMissingNumberInArray(ar);
    }




//        int ar[] = {1, 2, 3, 4,6};
//        int length = ar.length;
//
//        System.out.println(length);
//
//
//        //missing numbers in array
//
//        //sum = 11
//        //number of values = 4
//        //total 15 -sum = 4
//        int sum =0;
//        int total;
//        for (int i = 0; i <= ar.length-1; i++) {
//
//            sum = +ar[i];
//
//        }
//
//         total = sum + length;
//        int missingNum = total -sum;
//        System.out.println("Missing Numbers :"+missingNum);
//
//
//    }
}
