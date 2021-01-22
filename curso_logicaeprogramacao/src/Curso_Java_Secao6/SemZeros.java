package Curso_Java_Secao6;

import java.util.Locale;
import java.util.Scanner;

public class SemZeros {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os n�meros para soma");
		System.out.println("Digite 0 para finalizar sequencia");
		System.out.println("");
		System.out.println("");
		
		int numero = 0;
	    int soma   = 0, itens = 0;
		
		System.out.println("Sequencia de N�meros: ");
		
		do {
			numero = sc.nextInt();
			if (numero != 0) {
				soma += numero;
				itens++;
			}
		} while (numero != 0);
		
		System.out.println("");
		System.out.println("");

		System.out.println("ITENS = " + itens);
		System.out.println("");
		System.out.println("SOMA  = " + soma);
	
		sc.close();
	}
}
