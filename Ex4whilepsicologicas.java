package br.com.generation.entrega2.java;
import java.util.Scanner;
/*Projeto: Ex4 - WHILE Pesquisa psicologica
 * Alune: D�lis Edwirges
 * Data: 04/06/2021
 *4 - Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
	> n�mero de pessoas calmas; 
	> n�mero de mulheres nervosas; 
	> n�mero de homens agressivos; 
	> n�mero de outros calmos;
	> n�mero de pessoas nervosas com mais de 40 anos; 
	> n�mero de pessoas calmas com menos de 18 anos.
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
			System.out.println("Digite a op��o com o g�nero que voc� se identifica:"+"\n"+"1 para feminino,"+ "\n"+ "2 para masculino,"+ "\n" + "3 caso seja outro.");
			gen = ler.nextInt();
			System.out.println("Digite a op��o com como voc� se sente com mais frequ�ncia: "+"\n"+"1 para calme,"+ "\n"+ "2 para nervose,"+ "\n" + "3 para agressive.");
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
		System.out.println("O n�mero de pessoas calmas �: " + psi1);
		System.out.println("O n�mero de mulheres nervosas �: " + v1);
		System.out.println("O n�mero de homens agressivos �: " );
		System.out.println("O n�mero de pessoas com outro g�nero que s�o calmas �: ");
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: " +v4);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: ");
	}

}
