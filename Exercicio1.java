package LacosRepeticao;

public class Exercicio1 {
	public static void main (String[]args) {
		
		System.out.println("Os numero de 1000 a 1999\n"
				+ "Que s�o divisivei por 11 e o com resto igual a 5 s�o:");
		
		for (int x = 1000; x<=1999; x++ ) {
			
			if (x%11==5) {
				System.out.println(x);
			}
		
		}
	
	}
}