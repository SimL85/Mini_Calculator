package com.main;
import java.util.Scanner;
import com.classes.*;

public class Main {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please insert the first number");
			double a = input.nextDouble();
			System.out.println("Please insert the second number");
			double b = input.nextDouble();
			System.out.println("Please choose your operation + or -");
			String op = input.next();
			
			OverloadAdd n1 = new OverloadAdd();
			OverloadSub n2 = new OverloadSub();
			
			switch(op) {
			 case "+":System.out.println(n1.add(a,b));
			 break;
			 
			 case "-":System.out.println(n2.sub(a,b));
			 break;
			 default: System.out.println("Invalid comand!!");
			}
			
		}

	}

}
