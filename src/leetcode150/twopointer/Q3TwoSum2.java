package leetcode150.twopointer;

public class Q3TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        int l =0;
        int h =numbers.length-1;

        int[] result = new int[2];
        while (l<h){
            if(numbers[l]+numbers[h]>target){
                h--;
            } else if (numbers[l]+numbers[h]<target){
                l++;
            } else {
                result[0]=l+1;
                result[1]=h+1;
                break;
            }
        }
        return result;
    }
}
