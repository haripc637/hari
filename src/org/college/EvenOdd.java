package org.college;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp;
		int a[] = new int[n];
		
		for(int i=0; i<n;i++) {
			
			a[i] = in.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
	}
	for(int i=0; i<n;i++) {
		System.out.println(a[i]);
	}	
	}
}