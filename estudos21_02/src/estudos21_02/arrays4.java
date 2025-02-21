package estudos21_02;

import java.util.Scanner;

public class arrays4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10];
		int pares = 0 , impares = 0;
		
		System.out.print("DIGITE 10 NUMEROS: ");
		for(int i = 0; i < 10;i++) {
			numeros[i]= scanner.nextInt();
			if (numeros[i] %2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}

		System.out.print("Numeros Pares: " + pares);
		System.out.print("Numeros Impares: " + impares);
		
		scanner.close();
	}

	
}
