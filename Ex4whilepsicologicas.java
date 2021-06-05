package br.com.generation.entrega2.java;
import java.util.Scanner;
/*Projeto: Ex4 - WHILE Pesquisa psicologica
 * Alune: Délis Edwirges
 * Data: 04/06/2021
 *4 - Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
	> número de pessoas calmas; 
	> número de mulheres nervosas; 
	> número de homens agressivos; 
	> número de outros calmos;
	> número de pessoas nervosas com mais de 40 anos; 
	> número de pessoas calmas com menos de 18 anos.
 */
public class Ex4whilepsicologicas {
	public static void main(String[] args) {
		int psico=0, gen = 0, idade = 0, contg1= 0, contg2= 0, contg3= 0, pessoas=0;
		int psi1 = 0, psi2 = 0, psi3 = 0, ia = 0, ib = 0;
		int v1=0, v2=0, v3=0, v4=0, v5=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Pesquisa de caracteristicas psicologicas");
		System.out.println("------------------------------------------");
		while(pessoas<3) {
			pessoas++;
			System.out.println("Digite a sua idade: ");
			gen = ler.nextInt();
			System.out.println("Digite a opção com o gênero que você se identifica:"+"\n"+"1 para feminino,"+ "\n"+ "2 para masculino,"+ "\n" + "3 caso seja outro.");
			gen = ler.nextInt();
			System.out.println("Digite a opção com como você se sente com mais frequência: "+"\n"+"1 para calme,"+ "\n"+ "2 para nervose,"+ "\n" + "3 para agressive.");
			psico = ler.nextInt();
			if (gen==1 && gen <=3){
				contg1++;
				v1++;
				v4++;
				}
			else if(gen==2 && gen <=3) {
				contg2++;
				}
			else if(gen==3 && gen <=3) {
				contg3++;
				}
			if (psico==1 && psico <=3) {
				psi1++;
				}
			else if (psico==2 && psico <=3) {
				psi2++;
				v1++;
				}
			else if (psico==3 && psico <=3) {
				psi3++;
				}
			if (idade<18){
				ia++;
				}
			else if (idade>40){
				ib++;
				v4++;
				}
		}
		
			
		v1 = v1/2;
		v4 = v4/2;
		System.out.println("O número de pessoas calmas é: " + psi1);
		System.out.println("O número de mulheres nervosas é: " + v1);
		System.out.println("O número de homens agressivos é: " );
		System.out.println("O número de pessoas com outro gênero que são calmas é: ");
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " +v4);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: ");
	}

}
