package br.com.generation.entrega2.java;
import java.util.Scanner;
/*Projeto: Ex6 - DO...WHILE M�dia dos n�meros div por 3 inteiros
 * Alune: D�lis Edwirges
 * Data: 04/06/2021
 *6 - Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
public class Ex6dowhileinttec {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nums = 0, cont = 0, soma = 0;
		System.out.println("Digite os n�meros para a m�dia. Finalize com 0.");
		do {
		nums = ler.nextInt();
		if (nums%3==0 && nums!=0) {
		soma+=nums;
		cont++;
		}
		}
		while (nums != 0);
		double media = Double.valueOf(soma) / Double.valueOf(cont); //Usar Double.valueOf para colocar o resultado em double, perguntar pro Jeff sobre.
		System.out.println("Dos n�meros inseridos, a m�dia dos divisiv�is por 3 �: " + media);
	}
}
