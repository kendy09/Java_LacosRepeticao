package LacosRepeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[]args) {
		int par = 0,impar = 0;
		System.out.println("Digite 10 numeros");
		Scanner sc = new Scanner(System.in);
		
		for(int x = 1; x <= 10; x++) {
			System.out.println("Digite o numero #"+x);
			int numero = sc.nextInt();
				if (numero%2==0) {
					par++;
				}
				else {
					impar++;
				}
		}
		System.out.println("Foram digitados\n"+par+" numeros pares\n"
				+impar+" numeros impares");
		sc.close();
	}
}
