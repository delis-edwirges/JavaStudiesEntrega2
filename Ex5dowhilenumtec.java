package br.com.generation.entrega2.java;
import java.util.Scanner;
/*Projeto: Ex5 - DO...WHILE Ler n�mero teclado at� 0
 * Alune: D�lis Edwirges
 * Data: 04/06/2021
 *5 - Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */
public class Ex5dowhilenumtec {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num = 0, cont = 0;
		System.out.println("Digite os n�meros para soma. Finalize com o 0.");
		do {
		num = ler.nextInt();
		cont+= num;
		}
		while (num != 0);
		System.out.println("A soma dos n�meros inseridos �: " + cont);
	}
}
