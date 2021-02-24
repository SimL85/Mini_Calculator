package com.classes;

public class Addition {
	private int firstNumber = 0;
	private int secondNumber = 0;

	public Addition(int firstNumber, int secondNumber){
		this.firstNumber = firstNumber;
		this.secondNumber =secondNumber;
	}

	public int getAdd() {
		return  firstNumber + secondNumber;
	}

	
}

