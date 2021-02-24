package com.classes;

public class Subtraction {
	private int firstNumber = 0;
	private int secondNumber = 0;

	public Subtraction(int firstNumber, int secondNumber){
		this.firstNumber = firstNumber;
		this.secondNumber =secondNumber;
	}

	public int getSub() {
		return  firstNumber - secondNumber;
	}
}
