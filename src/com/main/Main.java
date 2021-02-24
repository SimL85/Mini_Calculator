package com.main;
import java.util.Scanner;
import com.classes.*;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose your operation \n[ + ],\n[ - ],"
		+ "\nfor double[ +D ],\nfor Float[ +F ]"
		+"\nfor double[ -D ],\nfor Float[ -F ]");
		String op = input.next();
		int a, b;
		double c, d, i, l;
					
		switch(op) {
			 case "+":
				System.out.println("Please insert the first number");
				a = input.nextInt();
				System.out.println("Please insert the second number");
				b = input.nextInt();
				Calculator n3 = new Calculator(a, b);
				System.out.println(n3.Add());
			 break;
			 
			 case "-":
				System.out.println("Please insert the first number");
				a = input.nextInt();
				System.out.println("Please insert the second number");
				b = input.nextInt();
				Calculator n4 = new Calculator(a, b); 
				System.out.println(n4.Sub());
			 break;
			 
			 case "+D":
				System.out.println("Please insert the first number");
				c = input.nextDouble();
				System.out.println("Please insert the second number");
				d = input.nextDouble();
				OverloadAdd n1 = new OverloadAdd(); 
				System.out.println(n1.add(c,d));
				
			 break;
			 
			 case "+F":
				System.out.println("Please insert the first number");
				float e = input.nextFloat();
				System.out.println("Please insert the second number");
				float f = input.nextFloat();
				OverloadAdd n2 = new OverloadAdd(); 
				System.out.println(n2.add(e,f));
			 break;
			 
			 case "-D":System.out.println("Please insert the first number");
				i = input.nextDouble();
				System.out.println("Please insert the second number");
				l = input.nextDouble();
				OverloadSub n6 = new OverloadSub(); 
				System.out.println(n6.sub(i,l ));
			 break;
			 
			 case "-F":System.out.println("Please insert the first number");
				float g = input.nextFloat();
				System.out.println("Please insert the second number");
				float h = input.nextFloat();
				OverloadSub n5 = new OverloadSub(); 
				System.out.println(n5.sub(g,h));
			 break;
			 
			 default: System.out.println("Invalid comand!!");
			 break;
			}
			
		

	}

}
