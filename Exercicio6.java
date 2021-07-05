package LacosRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String args[]) {
		int numero = 0, contador = 0;
		double media3 = 0;
		Scanner leitor = new Scanner(System.in);
		
		do {
			System.out.println("Digite numero");
			numero = leitor.nextInt();
			System.out.println("Contatador vale "+contador);
			if (numero % 3 == 0 && numero != 0) {
				media3 += numero;
				contador++;
			}
		}while(numero != 0);
		
		System.out.println("A media dos numeros multiplos de 3\n… igual a :"+media3/contador);
		leitor.close();
	}
}
