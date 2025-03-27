package alonetest;

import java.awt.SystemColor;

class Person{
	
	int age;
	String name;
	boolean marry;
	int offspring;
	
	
}

public class asdfiowa {
	
	public static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static int minus(int a, int b) {
		int result = a-b;
		return result;
	}
	
	public static int mult(int a, int b) {
		int result = a*b;
		return result;
	}
	
	public static double divide(int a, int b) {
		double result = a / b;
		return result;
	}

	public static void main(String[] args) {
		
//		int score;
//		char grade;
//		
//		switch(score) {
//		
//		case(90) : grade = 'A'; break;
//		}
		
		int t = 10; int s = 20;
		
		int u = add(t,s);
		System.out.println(t+"+"+s+"="+u);
		
		int v = minus(t,s);
		System.out.println(t+"-"+s+"="+v);
		
		int w = mult(t,s);
		System.out.println(t+"*"+s+"="+w);
		
		double x = divide(t,s);
		System.out.println(t+"/"+s+"="+x);
	}
	

}
