package estudos21_02;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[5];
		int soma = 0;
		
		
		System.out.print("Digite 5 numeros: ");
		for (int i = 0; i <5;i++) {
			numeros[i] = scanner.nextInt();
		
			soma += numeros[i];
		}
		System.out.print("soma total : " + soma );
		
		scanner.close();
	}

}
