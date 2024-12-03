package ejerciciosjuegos;

import java.util.*;

public class Ejer4 {
	
	// Función para la torre
	static char[][] torre(int row, int column, char[][]chessTable) {
		// Posición de la torre
		chessTable[row][column] = 'T';
		
		// Columnas
		for (int i = 0; i < chessTable[row].length; i++) {
			if (chessTable[row][i] != 'T') {
				chessTable[row][i] = 'X';
			}
		}
		
		// Filas
		for (int i = 0; i < chessTable.length; i++) {
			if (chessTable[i][column] != 'T') {
				chessTable[i][column] = 'X';
			}
		}
		
		return chessTable;
	}
	
	// Función para el alfil
	static char[][] alfil(int row, int column, char[][]chessTable) {
		// Posición de la torre
		chessTable[row][column] = 'A';
		
		int i = row - 1;
		int j = column - 1;
		
		// Diagonal izquierda / arriba
		do {
			chessTable[i][j] = 'X';
			
			i--;
			j--;
		} while (i >= 0 && j >= 0);
		
		// Diagonal derecha / arriba
		i = row - 1;
		j = column + 1;
		
		do {
			chessTable[i][j] = 'X';
			
			i--;
			j++;
		} while (i >= 0 && j < chessTable.length);
		
		// Diagonal izquierda / abajo
		i = row + 1;
		j = column - 1;
		
		do {
			chessTable[i][j] = 'X';
			
			i++;
			j--;
		} while (i < chessTable.length && j >= 0);
		
		// Diagonal derecha / abajo
		i = row + 1;
		j = column + 1;
		
		do {
			chessTable[i][j] = 'X';
			
			i++;
			j++;
		} while (i < chessTable[0].length && j < chessTable.length);
		
		return chessTable;
	}
	
	// Función para la dama
	static char[][] dama(int row, int column, char[][] chessTable) {
		torre(row, column, chessTable);
		alfil(row, column, chessTable);
		
		return chessTable;
	}
	
	// Función para imprimir el tablero
	static void printChessTable(char[][] chessTable) {
		for (int i = 0; i < chessTable.length; i++) {
			for (int j = 0; j < chessTable[i].length; j++) {
				System.out.print(chessTable[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Creamos el tablero de ajedrez
		char chessTable[][] = new char[8][8];
		
		int row; // Guardar la fila
		
		int column; // Guardar la columna
		
		char piece; // Guardar la pieza
		
		// Solicitamos los datos al usuario
		System.out.print("Introduce la fila: ");
		row = reader.nextInt();
		
		System.out.print("Introduce la columna: ");
		column = reader.nextInt();
		
		System.out.print("Introduce la pieza: ");
		// Nos interesa transformar la letra a mayúsculas
		piece = reader.next().toUpperCase().charAt(0);
		
		// Cerramos el scanner
		reader.close();
		
		// Switch modificar el tablero según la pieza
		switch (piece) {
		case 'T' -> torre(row, column, chessTable);
		case 'A' -> alfil(row, column, chessTable);
		case 'D' -> dama(row, column, chessTable);
		}
		
		// Imprimimos el tablero con los movimientos
		printChessTable(chessTable);

	}

}
