package org.college;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class College {

public static void main(String[] args) {
			
			List l = new ArrayList();
		
			
			l.add(2);
			l.add(5);
			l.add(1);
			l.add(7);
			l.add(3);
			l.add(6);
			l.add(4);
			
			System.out.println(l);
			
			int n=l.size();
			System.out.println(n);
			
		Collections.sort(l); 
		
			System.out.println(l);
		}
		}