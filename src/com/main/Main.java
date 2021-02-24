package com.main;
import java.util.Scanner;
import com.classes.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert the first number");
		int a = input.nextInt();
		System.out.println("Please insert the second number");
		int b = input.nextInt();
		System.out.println("Please choose your operation + or -");
		String op = input.next();
		
		Addition n1 = new Addition(a,b);
		Subtraction n2 = new Subtraction(a,b);
		int i = 0;
		switch(op) {
		 case "+": i=n1.getAdd();break;
		 case "-": i=n2.getSub();break;
		 default: System.out.println("Invalid comand!!");
		}
		System.out.println(a + op + b + " = " + i);

	}

}
