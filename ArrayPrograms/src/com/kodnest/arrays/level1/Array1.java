package com.kodnest.arrays.level1;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the "+arr.length+" elements into the array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		//Traditional For loop
		System.out.println("Using the Traditional For loop!!!");
		System.out.println("Array Contents are...");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Enhanced for loop
		System.out.println("Using the Enhanced For loop!!!");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
