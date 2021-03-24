package BDAC;

import java.util.*;

class Solution{
    // factorial 
    static int factorial(int num){
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
    // trailing zero
    static int trailing_zero(int num){
        int res = 0;
        for(int i = 5; num / i >= 1; i *= 5) {
            res = res + num / i;
        }
        return res;
    }
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(factorial(num)+" "+trailing_zero(num));
    }
}
