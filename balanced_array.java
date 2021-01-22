Emma has an array  of size  where  is an even number. An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.

image

To balance an array, Emma can add a non-negative integer  ( ) to any array element . Your task is to find the smallest value of  that makes the array balanced.

Input Format

The first line contains an even integer .

The second line contains the  integer elements of the array .

Constraints

 is an even number.
Output Format

Print the minimum value of  on a single line.

Sample Input 0

6
1 2 1 2 1 3
Sample Output 0

2
Explanation 0

image

The sum of first  elements is  and the sum of last  elements is . To make the array balanced you can add  to index  and make sum of both side equal to .

Sample Input 1

6
1 2 5 2 4 2
Sample Output 1

0
Explanation 1

The sum of both side is equal to , so the array is already balanced. Emma can add  to any index and keep it unchanged.

Sample Input 2

2
20 10
Sample Output 2

10


//code 

package com.company;

import java.util.*;

class Main{
    static int balacedarr(int arr[],int n){
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i<n/2;i++){
            sum1 += arr[i];
        }for(int i = n/2;i<n;i++){
            sum2 += arr[i];
        }
        if(sum1 > sum2)
            return (sum1 - sum2);
        else
            return (sum2 - sum1);
    }

    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = obj.nextInt();
        }
        int n = arr.length;
        System.out.print(balacedarr(arr,n));
    }
}
