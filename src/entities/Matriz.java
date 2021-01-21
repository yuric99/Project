package entities;

import java.util.ArrayList;
import java.util.List;

public class Matriz {

	public static String hasLeft(int matriz[][], int line, int column) {
		if ((column - 1) >= 0) {
			return "Left: " + matriz[line][column - 1];
		} else {
			return null;
		}
	}

	public static String hasRight(int matriz[][], int line, int column) {
		if ((column + 1) < matriz[line].length) {
			return "Right: " + matriz[line][column + 1];
		} else {
			return null;
		}
	}

	public static String hasUp(int matriz[][], int line, int column) {
		if ((line - 1) >= 0) {
			return "Up: " + matriz[line - 1][column];
		} else {
			return null;
		}
	}

	public static String hasDown(int matriz[][], int line, int column) {
		if ((line + 1) < matriz.length) {
			return "Down: " + matriz[line + 1][column];
		} else {
			return null;
		}

	}

	public static String hasDownLeftDiagonals(int matriz[][], int line, int column) {
		List<Integer> result = new ArrayList<>();

		int j = column;
		for (int i = line; i < matriz.length; i++) {
			if ((i + 1) < matriz.length && (j - 1) >= 0) {
				result.add(matriz[i + 1][j - 1]);
				j--;
			}
		}

		Integer resultVerify = result.stream().filter(x -> x != null).findAny().orElse(null);

		if (resultVerify == null) {
			return null;
		} else {
			return "Down Left Diagonals: " + result;
		}

	}

	public static String hasDownRightDiagonals(int matriz[][], int line, int column) {
		List<Integer> result = new ArrayList<>();

		int j = column;
		for (int i = line; i < matriz.length; i++) {
			if ((i + 1) < matriz.length && (j + 1) < matriz[line].length) {
				result.add(matriz[i + 1][j + 1]);
				j++;

			}
		}

		Integer resultVerify = result.stream().filter(x -> x != null).findAny().orElse(null);

		if (resultVerify == null) {
			return null;
		} else {
			return "Down Right Diagonals: " + result;
		}
	}

	public static String hasUpLeftDiagonals(int matriz[][], int line, int column) {
		List<Integer> result = new ArrayList<>();

		int j = column;
		for (int i = line; i >= 0; i--) {
			if ((i - 1) >= 0 && (j - 1) >= 0) {
				result.add(matriz[i - 1][j - 1]);
				j--;

			}
		}

		Integer resultVerify = result.stream().filter(x -> x != null).findAny().orElse(null);

		if (resultVerify == null) {
			return null;
		} else {
			return "Up Left Diagonals: " + result;
		}

	}

	public static String hasUpRightDiagonals(int matriz[][], int line, int column) {
		List<Integer> result = new ArrayList<>();

		int j = column;
		for (int i = line; i >= 0; i--) {
			if ((i - 1) >= 0 && (j + 1) < matriz[line].length) {
				result.add(matriz[i - 1][j + 1]);
				j++;
			}
		}

		Integer resultVerify = result.stream().filter(x -> x != null).findAny().orElse(null);

		if (resultVerify == null) {
			return null;
		} else {
			return "Up Right Diagonals: " + result;
		}
	}
}
