package LacosRepeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[]args) {
		
		int MenorIdade = 0,idade  = 0, idosos = 0;
		Scanner sc = new Scanner(System.in);
		
		
		while(idade != -99) {
			
			System.out.println("Digite a idade");
			idade = sc.nextInt();
			
			if (idade <21){
				MenorIdade++;
			}
			
			else if (idade>51) {
				idosos++;
			}
		}
		System.out.println("Das pessoas que digitaram\n"+MenorIdade+" Pessoas  "
				+ "são maior idade\nE "+idosos+" são idosos");
		sc.close();
	}
}
