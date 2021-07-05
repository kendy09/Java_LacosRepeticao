package LacosRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[]args) {
		int numero = 1,soma = 0,contador = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero");
			numero = sc.nextInt();
			soma +=numero;
			contador++;
		}while(numero != 0);
		System.out.println("A media da soma dos #"+contador+" é igual a : "+soma/(contador-1));
		sc.close();
	}
}
