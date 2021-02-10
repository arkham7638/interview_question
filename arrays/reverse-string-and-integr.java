Write a program to reverse an array or string

Iterative way :
 

1) Initialize start and end indexes as start = 0, end = n-1 
2) In a loop, swap arr[start] with arr[end] and change start and end as follows : 
start = start +1, end = end – 1

package com.company;

import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        String arr[] = new String[size];
        for(int i = 0;i<size;i++){
            arr[i] = obj.next();
        }
        for(int i = 0;i<arr.length;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = temp;

        }
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
