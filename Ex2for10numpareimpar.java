package br.com.generation.entrega2.java;
import java.util.Scanner;
/*Projeto: Ex2 - FOR Ler 10 numeros
 * Alune: Délis Edwirges
 * Data: 04/06/2021
 *2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
public class Ex2for10numpareimpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		int num = 0, par = 0, impar = 0;
		System.out.println("Escreva os números: ");
		for(; num<=10; num++) {
		num = ler.nextInt();
		
		if(num<-0) {
		System.out.println("Números negativos são inválidos. Tente novamente com um valor positivo.");
		}
		else if(num%2==0) {
		par++;
		}
		else if (num%2 == 1 ){
		impar++;
		}

		}
		System.out.println("Números pares: " + par);
		System.out.println("Números ímpares: " + impar);
	}
}
