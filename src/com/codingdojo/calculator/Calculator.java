package com.codingdojo.calculator;

public class Calculator extends CalcAbstract implements CalcInterface {
	public Calculator(double operandOne, double operandTwo, String operation) {
		super(operandOne, operandTwo, operation);
	}
	public double performOperation() {
		double result = 0;
		if(getOperation() == "+") {
			result = getOperandOne() + getOperandTwo();
		}
		if(getOperation() =="-") {
			result = getOperandOne() - getOperandTwo();
		}
		return result;
	}
	public void getResults() {
		System.out.println(performOperation()+ " is the result");
	}

}
