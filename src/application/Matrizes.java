package application;

import java.util.Scanner;

import entities.Matriz;

public class Matrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please insert the number of lines and columns: ");
		int lines = sc.nextInt();
		int columns = sc.nextInt();

		int[][] matriz = new int[lines][columns];

		System.out.println("Write the values in lines: ");
		for (int line = 0; line < matriz.length; line++) {
			for (int column = 0; column < matriz[line].length; column++) {
				matriz[line][column] = sc.nextInt();
			}
		}
		System.out.println();
		char confirmation = 'Y';

		while (confirmation == 'Y' || confirmation == 'y') {
			System.out.print("Write the number you wish to search on the matrix: ");
			int search = sc.nextInt();
			sc.nextLine();

			int searchVerify = 0;

			for (int line = 0; line < matriz.length; line++) {
				for (int column = 0; column < matriz[line].length; column++) {
					if (matriz[line][column] == search) {

						searchVerify++;
						System.out.println("");
						System.out.println("Position " + line + ", " + column);
						/* Left */
						if (Matriz.hasLeft(matriz, line, column) != null) {
							System.out.println(Matriz.hasLeft(matriz, line, column));
						}

						/* Right */
						if (Matriz.hasRight(matriz, line, column) != null) {
							System.out.println(Matriz.hasRight(matriz, line, column));
						}
						/* Up */
						if (Matriz.hasUp(matriz, line, column) != null) {
							System.out.println(Matriz.hasUp(matriz, line, column));
						}

						/* Down */
						if (Matriz.hasDown(matriz, line, column) != null) {
							System.out.println(Matriz.hasDown(matriz, line, column));
						}

						/* Down Left Diagonals */
						if (Matriz.hasDownLeftDiagonals(matriz, line, column) != null) {
							System.out.println(Matriz.hasDownLeftDiagonals(matriz, line, column));
						}

						/* Down Right Diagonals */
						if (Matriz.hasDownRightDiagonals(matriz, line, column) != null) {
							System.out.println(Matriz.hasDownRightDiagonals(matriz, line, column));
						}

						/* Up Left Diagonals */
						if (Matriz.hasUpLeftDiagonals(matriz, line, column) != null) {
							System.out.println(Matriz.hasUpLeftDiagonals(matriz, line, column));
						}

						/* Up Right Diagonals */
						if (Matriz.hasUpRightDiagonals(matriz, line, column) != null) {
							System.out.println(Matriz.hasUpRightDiagonals(matriz, line, column));
						}
					}
				}
			}

			if (searchVerify == 0) {
				System.out.println("The number " + search + " doesn't exist inside the matrix.");
			}

			System.out.println("");
			System.out.print("Do you want to search another number(Yes/No)? ");
			confirmation = sc.nextLine().charAt(0);
			searchVerify = 0;
			System.out.println();
		}
		
		sc.close();	
	}
}
