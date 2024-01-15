package leetcode150.arrays;

public class Q17RomanToInteger {

    /*
    Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
     */
    public int getValue(Character c){

        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }

    }

    public int romanToInt(String s) {
        int sum = 0;
        int n = s.length();
        for(int i = 0;i<n;i++){
            Character c = s.charAt(i);
            if(i+1<n && getValue(c)<getValue(s.charAt(i+1))){
                sum-= getValue(c);
            } else {
                sum+= getValue(c);
            }
        }

        return sum;

    }
}
