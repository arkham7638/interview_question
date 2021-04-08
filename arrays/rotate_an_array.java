package BDAC;

import java.util.*;

class Main{
	static void reverse(int arr[],int start,int end) {

		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
    //rotate an array counter clockwise direction
	static void counter_rotate(int arr[],int d) {
		reverse(arr,0,d-1);
		
		reverse(arr,d,arr.length-1);
		
		reverse(arr,0,arr.length-1);
	}
    //rotate an array in clockwise direction
	static void anti_rotate(int arr[],int d) {
		reverse(arr,0,arr.length-d-1);
		
		reverse(arr,arr.length-d,arr.length-1);
		
		reverse(arr,0,arr.length-1);
	}
	static void printArray(int arr[],int size) {
		for(int i = 0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}		
	}
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = obj.nextInt();
		int arr[] = new int[size];
		for(int i = 0;i<size;i++) {
			arr[i] = obj.nextInt();
		}
		int start = 0;
		int end = size - 1;
		System.out.println("enter the given element");
		int d = obj.nextInt();
		Main onj = new Main();
	    onj.counter_rotate(arr,d);
	    onj.anti_rotate(arr,d);
	    onj.printArray(arr,size);
	}
}
