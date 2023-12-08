package leetcode.arrays.arrays2;

public class Q5RepeatAndMissingNumber {
    public int[] repeatedNumber(final int[] A)  {
        int missing = 0;
        int repeated = 0;
        for(int i = 0 ;i< A.length ;i++){
            if(A[Math.abs(A[i])-1]<0){
                missing = Math.abs(A[i]);
            } else{
                A[Math.abs(A[i])-1] = A[Math.abs(A[i])-1]*(-1);
            }
        }

        for(int i = 0 ;i< A.length ;i++){
            if(A[i]>0){
                repeated = i+1;
            }
        }
        return new int[]{missing, repeated};
    }
}
