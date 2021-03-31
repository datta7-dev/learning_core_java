package collections;

import java.util.Scanner;

public class ArrayCollection {
	public static void main(String args[]) {

		// integer array;
		int ar[] = new int[10];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;
		ar[5] = 60;
		ar[6] = 70;
		ar[7] = 80;
		ar[8] = 90;
		ar[9] = 100;
		for (int i = 0; i < 10; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();

		// string array;
		String ar1[] = new String[10];
		ar1[0] = "asq";
		ar1[1] = "wedw";
		ar1[2] = "wfer";
		ar1[3] = "erfe";
		ar1[4] = "ef";
		ar1[5] = "efre";
		ar1[6] = "erfef";
		ar1[7] = "uhbu";
		ar1[8] = "ubu";
		ar1[9] = "uhbu";
		for (int i = 0; i < 10; i++) {
			System.out.print(ar1[i] + " ");
		}
		System.out.println();
		for (String i : ar1) {
			System.out.print(i + " ");
		}

		// char array;
		char ar2[] = new char[10];
		ar2[0] = 'a';
		ar2[1] = 'b';
		ar2[2] = 'c';
		ar2[3] = 'd';
		ar2[4] = 'd';
		ar2[5] = 'e';
		ar2[6] = 'f';
		ar2[7] = 'g';
		ar2[8] = 'h';
		ar2[9] = 'i';
		System.out.println();
		for (char i : ar2) {
			System.out.print(i + " ");
		}

		// multidimensional array;
		int matrix[][] = new int[2][2];
		Scanner input = new Scanner(System.in);
		// accept matrix;
		System.out.println("\nenter matrix elements:");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		// print matrix;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// copy array elements from another array;
		int source[] = { 10, 20, 30, 40, 50, 60, 70 };
		int destination[] = new int[10];
		System.arraycopy(source, 0, destination, 2, 5);
		// (source array name,starting index of source array,destination array
		// name,starting index of destination array,length as per source array i.e.
		// length should be less than/equal to source array length)
		for (int i : destination) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// array clone;
		// it is used to copy whole array from one array to another array;
		int a[] = { 100, 200, 300, 40, 500, 600, 700, 800, 900, 1000 };
		int b[] = a.clone();
		for (int i : b) {
			System.out.print(i + " ");
		}
		
		System.out.println();

		System.out.println(a.equals(b));
	}

}
