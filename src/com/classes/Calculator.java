package com.classes;

public class Calculator {
	private int firstNumber = 0;
	private int secondNumber = 0;

	public Calculator(int firstNumber, int secondNumber){
		this.firstNumber = firstNumber;
		this.secondNumber =secondNumber;
	}

	public int Add() {
		return  firstNumber + secondNumber;
	}
	public int Sub() {
		return  firstNumber - secondNumber;
	}
}
