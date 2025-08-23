package com.pratice.oops.Inheritence;

public class AdvancedCalculator extends IntermediateCalculator{
	
	  public void fact(int num) {
	int fact = 1;
    for (int i = 1; i <= num; i++) {
        fact *= i;
    }
    System.out.println("Factorial of " + num + " is: " + fact);
}

public void log(int a, int b) {
    System.out.println("Logarithm base " + b + " of " + a + " is: " + (Math.log(a) / Math.log(b)));
}

}
