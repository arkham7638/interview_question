package BDAC;

import java.util.*;

class Main{
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = obj.nextInt();
		int a[] = new int[size];
		for(int i = 0;i<size;i++) {
			a[i] = obj.nextInt();
		}
		int res  = Math.abs(a[1] - a[0]);
		for(int i = 2;i<size;i++) {
			res = Math.min(res, Math.abs(a[i] - a[i-1]));
			
		}
		
		System.out.print(res+" ");
	}
}
