package br.com.generation.entrega2.java;
import java.util.Scanner;
/*Projeto: Ex6 - DO...WHILE Média dos números div por 3 inteiros
 * Alune: Délis Edwirges
 * Data: 04/06/2021
 *6 - Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
public class Ex6dowhileinttec {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nums = 0, cont = 0, soma = 0;
		System.out.println("Digite os números para a média. Finalize com 0.");
		do {
		nums = ler.nextInt();
		if (nums%3==0 && nums!=0) {
		soma+=nums;
		cont++;
		}
		}
		while (nums != 0);
		double media = Double.valueOf(soma) / Double.valueOf(cont); //Usar Double.valueOf para colocar o resultado em double, perguntar pro Jeff sobre.
		System.out.println("Dos números inseridos, a média dos divisivéis por 3 é: " + media);
	}
}
