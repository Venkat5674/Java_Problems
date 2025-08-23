package com.pratice.oops.Inheritence;

public class IntermediateCalculator extends SimpleCalculator {

	public void pow(int a, int b) {
        System.out.println("Power: " + Math.pow(a, b));
    }

    public void sqrt(int num) {
        System.out.println("Square Root: " + Math.sqrt(num));
    }
	
}
