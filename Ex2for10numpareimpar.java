package br.com.generation.entrega2.java;
import java.util.Scanner;
/*Projeto: Ex2 - FOR Ler 10 numeros
 * Alune: D�lis Edwirges
 * Data: 04/06/2021
 *2 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
public class Ex2for10numpareimpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		int num = 0, par = 0, impar = 0;
		System.out.println("Escreva os n�meros: ");
		for(; num<=10; num++) {
		num = ler.nextInt();
		
		if(num<-0) {
		System.out.println("N�meros negativos s�o inv�lidos. Tente novamente com um valor positivo.");
		}
		else if(num%2==0) {
		par++;
		}
		else if (num%2 == 1 ){
		impar++;
		}

		}
		System.out.println("N�meros pares: " + par);
		System.out.println("N�meros �mpares: " + impar);
	}
}
