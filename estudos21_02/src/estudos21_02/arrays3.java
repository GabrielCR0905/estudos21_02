package estudos21_02;

import java.util.Scanner;

public class arrays3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[3];
		double soma =0;
		
		System.out.print("Digite as tres notas a serem somadas");
		for(int i = 0; i <3;i++) {
		numeros[i] = scanner.nextInt();
		soma += numeros[i];
	}
		double media= soma /3;
		System.out.print("A soma das notas são: " + soma + "E sua media é" + media);
		scanner.close();
	}
}
