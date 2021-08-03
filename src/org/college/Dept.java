package org.college;

public class Dept {
	
   public static int a; //a=0;
	
	public void deptCse() {
	 a=10;
	System.out.println(a);
	 }
	
	public void ramu() 
	 {
		a = 20;
		System.out.println(a); 
	 }
	 public static void main(String[] args) {
		Dept d=new Dept();
		System.out.println(d.a);
		d.ramu(); 
		d.deptCse();
		
		Dept c = new Dept();
		System.out.println(c.a); 
		c.deptCse();
		c.ramu();
	}
	 }
