package ejer191;

import java.util.Iterator;
import java.util.Scanner;

public class ejer191 {
	/*1.Sistema de Reserva de Asientos para Cine
   -Pasos:
     1. Crea una matriz para representar los asientos del cine (por ejemplo, `char[][] asientos`).
     2. Inicializa todos los asientos como libres (por ejemplo, usando el carácter 'L').
     3. Muestra la matriz de asientos en la consola.
     4. Pide al usuario que ingrese el número de fila y columna para seleccionar un asiento.
     5. Verifica si el asiento está libre. Si lo está, márcalo como ocupado (por ejemplo, con 'O'). Si no, muestra un mensaje de error.
     6. Repite los pasos 3 a 5 hasta que el usuario decida salir.*/
	public static void main(String[] args) {
		int filas = 5;
		int columnas = 10;
		char[][] asientos = new char[filas][columnas];
		for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asientos[i][j] = 'L';
            }
        }
		mostrarAsientos(asientos);
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero de fila: ");
		int fila = sc.nextInt();
		if (fila == -1) {
			System.out.println("introduce una fila real");
			}
		System.out.println("Introduce un numero de columna: ");
		int columna = sc.nextInt();
		if()
		}
	
	}

}
