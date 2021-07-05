package LacosRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[]args) {
		
		int temperamento = 0,numeroPessoas = 1 ,idade = 0,
			HomensAgressivo = 0,
			PessoasNervosas40Mais = 0,MulheresNervosas = 0,
			PessoasCalmas = 0, PessoasCalmas18Menos = 0, Outroscalmos = 0;
		char sexo;
		Scanner sc = new Scanner(System.in);
		
		while (numeroPessoas  <= 3) {
			System.out.println("Qual é a sua temperamento\n1-Calmo\n"
					+ "2-Nervoso\n3-Agresivo");
			temperamento = sc.nextInt();
			
			switch (temperamento) {
			
				case 1:  
					PessoasCalmas++;
					System.out.println("Digite o sua idade");
					idade = sc.nextInt();
					if(idade<18) {
						PessoasCalmas18Menos++;
					}
					System.out.println("Digite o seu sexo [F/M/O-OUTROS]");
					sexo = sc.next().charAt(0);
					if (sexo == 'o'||sexo =='O') {
						Outroscalmos++;
					}
					numeroPessoas++;
					break;
				
				case 2:
					System.out.println("Digite o sua idade");
					idade = sc.nextInt();
						if(idade>40) {
							PessoasNervosas40Mais++;
						}
					System.out.println("Digite o seu sexo [F/M/O-OUTROS]");
					sexo = sc.next().charAt(0);
					if (sexo == 'M'||sexo == 'm') {
						MulheresNervosas++;
						}
					numeroPessoas++;
					break;
						
				case 3:
					System.out.println("Digite o seu sexo [F/M/O-OUTROS]");
					sexo = sc.next().charAt(0);
					if (sexo == 'M'||sexo == 'm') {
						HomensAgressivo++;
						}
					numeroPessoas++;
					break;
				
				default:
					System.out.println("Erro digite novamente");
		
			}
		}
			System.out.println("O numero de pessoas calmas são "
					+ "de "+PessoasCalmas+"\nE o numero de pessoas com menos de 18 é igual a:"
							+PessoasCalmas18Menos+"\nE o numero de outras pessoas"
									+ "calmas é de"+Outroscalmos);
			
			System.out.println("O numero de pessoas agressivas com mais de 40 anos são"+
					PessoasNervosas40Mais+"\nO numero de mulheres nervosas é  igual a: "+MulheresNervosas);
			
			System.out.println("O total de homens agressivos é  igual a "+HomensAgressivo);
			sc.close();
	}
}
