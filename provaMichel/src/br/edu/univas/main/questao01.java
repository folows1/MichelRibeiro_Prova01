package br.edu.univas.main;

import java.util.Scanner;

public class questao01 {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		int num, negativos = 0;
		do {
			System.out.println("Digite um n�mero: ");
			num = l.nextInt();
			if (num < 0) {
				negativos++;
			}
		} while (num != 0);
		System.out.println("Quantidade de n�meros negativos: " + negativos);
		l.close();
	}
}
