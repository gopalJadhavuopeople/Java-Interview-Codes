package GopalPracticePkg;

public class MissingValueInArray {

    public static void main(String[] args) {
        int ar[]={1,2,3,4,6,7,8,9};

        int expTotalNumOfValues = ar.length +1;

        System.out.println(expTotalNumOfValues);

        int expSumOfValues = expTotalNumOfValues * (expTotalNumOfValues+1)/2;

        System.out.println(expSumOfValues);
        int totalSum = 0;
        for(int a : ar){
            totalSum +=a;

        }

        int missingValue = expSumOfValues -totalSum;
        System.out.println(missingValue);


    }
}
