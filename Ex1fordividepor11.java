package br.com.generation.entrega2.java;
import java.util.Scanner;
/*Projeto: Ex1 - FOR Numeros div 11
 * Alune: Délis Edwirges
 * Data: 04/06/2021
 *1 - Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
 */
public class Ex1fordividepor11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num =1000;
		System.out.println("Números de 1000 a 1999 que divididos por 11 tem resto igual a 5: " );
		for(; num<=1999; num++) {
			if(num%11==5)
			System.out.printf(num + ", ");
			}
		
		}

}
