package com.madhu.programs;
import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number to check even or odd1");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to check even or odd");
		int number = scan.nextInt();
		if(number%2==0) {
			System.out.println("given number is even");
		}
		else
		System.out.println("Given Number is odd");

	}

}
