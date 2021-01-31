Given an array arr[] of size N of positive integers which may have duplicates. The task is to find the maximum and second maximum from the array, and both of them should be distinct, so If no second max exists, then the second max will be -1.

Example 1:

Input:
N = 3
arr[] = {2,1,2}
Output: 2 1
Explanation: From the given array 
elements, 2 is the largest and 1 
is the second largest.
Example 2:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 5 4
Explanation: From the given array 
elements, 5 is the largest and 4 
is the second largest.
Your Task:
The task is to complete the function largestAndSecondLargest(), which should return maximum and second maximum element from the array with first element as maximum element and second element as second maximum(if there is no second maximum the  second element should be -1)

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
1 <= arr[i] <= 106

  
  //driver code
  import java.util.*;
class Array{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        int largest = arr[size-1];
        int second = 0 ;
        for(int i =size - 2; i >= 0; i--){
            if(arr[i] != largest)
                second  = arr[i];
            else
                second = -1;
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(largest);
        al.add(second);
        System.out.println(al);
    }
}

//pls note that the current code does not work for some cases i.e the case towards infinte numbers
