package com.codingdojo.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator n = new Calculator(5.5, 3.5, "+");
		n.getResults();
		Calculator y = new Calculator(2, 7, "-");
		y.getResults();
	}

}
