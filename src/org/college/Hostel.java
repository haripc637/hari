package org.college;

public class Hostel {
	
	public static void main(String[] args) {
	
		String s = " Hari Kumar ";
		
		String s1 = "Hari";
		
		int length= s.length();
		System.out.println("length of the string = " +length);	
		
		char c = s.charAt(0); //hari
		System.out.println(c);
		
		int a = s.indexOf("u");
		System.out.println(a);
		
		String b = s.toUpperCase();
		String e = s.toLowerCase();
		System.out.println("Uppercase=" +b +"\nLower case=" +e);
		
		boolean f = s.isEmpty();
		
		if(f==true) {
			
			System.out.println("String is empty ");
		}
		else {
			System.out.println("String is not empty, it contains = " +s);
		}
		
		boolean g = s.startsWith("t");
		boolean h=s.endsWith("r");
		System.out.println(g);
		System.out.println(h);
		
		int i = s.lastIndexOf("a");
		System.out.println(i);
		
		boolean j = s.contains("r");
		System.out.println(j);
		
		boolean k = s.equals(s1);
		System.out.println(k);
		
		String l = s.replace("a", "Dinesh");
		
		System.out.println(l);
		
		String trim = s.trim();
		System.out.println(trim);
		
		String[] split = s.split("a");
		
		for(String z:split) {
			
			System.out.println(z);
		}

		
	}
}