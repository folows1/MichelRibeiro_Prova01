package br.edu.univas.main;

import java.util.Scanner;

public class questao03 {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		int num;
		int numArredondado;
		System.out.println("Digite um n�mero: ");
		num = l.nextInt();
		if (num % 5 == 3) {
			numArredondado = num + 2;
			System.out.println("O n�mero " + num + " foi arredondado para " + numArredondado);
		} else if (num % 5 == 4) {
			numArredondado = num + 1;
			System.out.println("O n�mero " + num + " foi arredondado para " + numArredondado);
		} else {
			System.out.println("N�mero n�o precisou ser arredondado: " + num);
		}
		l.close();
	}
}
