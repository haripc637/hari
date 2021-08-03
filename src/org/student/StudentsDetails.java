package org.student;

import java.util.Scanner;

public class StudentsDetails {
	
public static void main(String[] args) {
	
//Reverse a String: harikumar - kumarhari
	
	String reverse= "";
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a name");
	String input = in.nextLine(); 
	
	char c[]=input.toCharArray();
	for (int i=c.length-1;i>=0;i--) {
		
		reverse = reverse+c[i]; 
		}
	System.out.println(reverse);
	
	
	
}
}