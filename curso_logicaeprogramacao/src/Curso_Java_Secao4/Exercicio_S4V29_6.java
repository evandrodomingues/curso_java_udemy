package Curso_Java_Secao4;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_S4V29_6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.print("VALOR A: ");
		A = sc.nextDouble();
		
		System.out.print("VALOR B: ");
		B = sc.nextDouble();
		
		System.out.print("VALOR C: ");
		C = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("a) a área do triângulo retângulo que tem A por base e C por altura.");
		System.out.println("b) a área do círculo de raio C.");
		System.out.printf("   Considerar pi = %.5f%n", pi);
		System.out.println("c) a área do trapézio que tem A e B por bases e C por altura.");
		System.out.println("d) a área do quadrado que tem lado B.");
		System.out.println("e) a área do retângulo que tem lados A e B.");		
		
		triangulo = A * C / 2.0;
		circulo = pi * Math.pow(C, 2.0);
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.println();
		
		System.out.printf("A) - TRIANGULO : %.3f%n", triangulo);
		System.out.printf("B) - CIRCULO   : %.3f%n", circulo);
		System.out.printf("C) - TRAPEZIO  : %.3f%n", trapezio);
		System.out.printf("D) - QUADRADO  : %.3f%n", quadrado);
		System.out.printf("E) - RETANGULO : %.3f%n", retangulo);
		
		sc.close();
	}
}
