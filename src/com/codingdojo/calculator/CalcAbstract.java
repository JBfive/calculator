package com.codingdojo.calculator;

public abstract class CalcAbstract {
	private double operandOne;
	private double operandTwo;
	private String operation;
	
	public CalcAbstract(double operandOne, double operandTwo, String operation) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
}
