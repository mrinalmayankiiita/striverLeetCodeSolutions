package gfg.recursion;

public class JosephusProblem {

    /*
    https://leetcode.com/problems/find-the-winner-of-the-circular-game/solutions/
     */

    public int findWinnerIndex(int n, int k){
        if(n==1) return 0;
        return (findWinnerIndex(n-1, k) + k) % n;
    }
}
