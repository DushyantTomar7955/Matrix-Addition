package com.jspider;
import java.util.Scanner;

public class MatricsAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Rows: ");
		int n=sc.nextInt();
		System.out.print("Enter the Number of Columns: ");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
	    System.out.println("Enter the First Matrics ");	
		for (int i=0;i<n;i++) {
			System.out.println("Enter the "+(i+1)+" Row");
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter the Second Matrics");
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+(i+1)+" Row");
			for(int j=0;j<m;j++) {
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}

		int c[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("After Addition of Matrics: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
