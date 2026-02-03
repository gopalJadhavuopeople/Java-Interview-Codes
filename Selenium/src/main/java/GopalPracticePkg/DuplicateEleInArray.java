package GopalPracticePkg;

import java.util.HashSet;

public class DuplicateEleInArray {
    public static void main(String[] args) {
        int ar[]={5,5,3,2,1,8,3,0,5,2,4,1,5,7,8,9};
        //duplicate ele
        int result = 0;
        HashSet<Integer> duplicate = new HashSet<>();
        for(int i= 0; i<=ar.length-1; i++){
            for(int j=i+1; j<=ar.length-1; j++){
                if(ar[i]==ar[j]){
                    duplicate.add(ar[i]);




                }
            }

        }
        System.out.println(duplicate);
    }
}
