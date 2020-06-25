package br.edu.univas.main;

import java.util.Scanner;

public class questao02 {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		int quantidadeSim = 0, quantidadeNao = 0;
		int regiao = 0, sul = 0, sudeste = 0, centro = 0, norte = 0, nord = 0;
		for (int i = 0; i < 100; i++) {
			int resposta = 0;
			while (resposta != 1 && resposta != 2) {
				System.out.println("Voc� acredita que a vacina fique pronta ainda em 2020?");
				System.out.println("1 - Sim");
				System.out.println("2 - N�o");
				resposta = l.nextInt();
			}
			if (resposta == 1) {
				quantidadeSim++;
			} else {
				quantidadeNao++;
			}
			System.out.println("----------------------------------------");
			System.out.println("Qual regi�o do Brasil voc� mora? ");
			System.out.println("1 - Sul");
			System.out.println("2 - Sudeste");
			System.out.println("3 - Centro-Oeste");
			System.out.println("4 - Norte");
			System.out.println("5 - Nordeste");
			regiao = l.nextInt();
			if (regiao == 1) {
				sul++;
			} else if (regiao == 2) {
				sudeste++;
			} else if (regiao == 3) {
				centro++;
			} else if (regiao == 4) {
				norte++;
			} else if (regiao == 5) {
				nord++;
			} else {
				System.out.println("Op��o inv�lida!");
			}
		}
		l.close();
		System.out.println("Quantidade de pessoas que votaram SIM: " + quantidadeSim);
		System.out.println("Quantidade de pessoas que votaram N�O: " + quantidadeNao);
		System.out.println("Votos por regi�o: ");
		System.out.println("Sul: " + sul);
		System.out.println("Sudeste: " + sudeste);
		System.out.println("Centro-Oeste: " + centro);
		System.out.println("Norte: " + norte);
		System.out.println("Nordeste: " + nord);
	}
}
