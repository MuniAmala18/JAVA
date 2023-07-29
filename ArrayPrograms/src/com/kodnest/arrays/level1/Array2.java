package com.kodnest.arrays.level1;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter the size of an array:");
	int n=scan.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the "+arr.length+" elements into the array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	//Enhanced for loop
	System.out.println("Using the Enhanced For loop!!!");
	for (int i : arr) {
		System.out.print((i+5)+" ");
	}
}
}
