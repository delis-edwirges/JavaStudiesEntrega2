package br.com.generation.entrega2.java;
import java.util.Scanner;
/*Projeto: Ex3 - WHILE Classicar 2 grupos de idades diferentes
 * Alune: Délis Edwirges
 * Data: 04/06/2021
 *3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */
public class Ex3whileidade2totais {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idades = 0, m21 = 0, m50 =0;
		System.out.println("Digite as idades, para finalizar o programa escreva -99");
		while(idades != -99){
		idades = ler.nextInt();
		
		if(idades<=21 && idades>0) {
		m21++;
		}
		else if (idades>=50) {
		m50++;
		}
		}
		System.out.println("As pessoas com menos 21 anos são: " + m21);
		System.out.println("As pessoas com mais de 50 anos são: " + m50);

	}
}
