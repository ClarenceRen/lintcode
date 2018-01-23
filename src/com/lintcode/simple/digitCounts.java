package com.lintcode.simple;

public class digitCounts {

    public static  int digitCount(int k, int n) {
        int current =0;
        int before = 0;
        int after = 0;
        int i = 1 ,count =0 ;

        while(n/i!=0){
            current = (n/i)%10;
            before = n/(i*10);
            after = n-n/i*i;
            if(current > k){
                count = count + (before+1) *i;
            }else if(current < k){
                count = count + before *i;
            }else {
                count = count + before*i+after+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(digitCount(122,2));
    }

}
