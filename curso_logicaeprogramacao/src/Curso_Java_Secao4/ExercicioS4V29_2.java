package Curso_Java_Secao4;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioS4V29_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi = 3.14159;
		
		raio = sc.nextDouble();
		
		area = pi*Math.pow(raio, 2.0);
		
		System.out.printf("AREA = %.4f%n",area);

		sc.close();

	}

}
