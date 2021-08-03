package org.college;


import java.util.Scanner;

public class Student {
	
public static void main(String[] args) {
	
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter a string to reverse:");
	String s=ss.nextLine();
    char c;
	String rev="";
	for(int i=s.length()-1;i>=0;i--) { 
		
		c=s.charAt(i);
		rev+=c ;
	}
			
	System.out.println("String reverse = "+rev);		

}}

