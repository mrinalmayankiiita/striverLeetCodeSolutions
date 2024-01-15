package leetcode150.arrays;

public class Q14GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] diffArray = new int[n];

        for(int i =0;i<n;i++){
            diffArray[i]=gas[i]-cost[i];
        }

        int i=0,j=0;


        while(i<n){
            int sum = 0;
            int count=0;
            for(;count<n;count++){
                j = j%n;
                sum+=diffArray[j];
                if(sum<0){
                    i=j;
                    j++;
                    break;

                }
                j++;
            }
            if(sum>=0) {
                return i;
            }
            i++;
        }

        return -1;


    }
}
