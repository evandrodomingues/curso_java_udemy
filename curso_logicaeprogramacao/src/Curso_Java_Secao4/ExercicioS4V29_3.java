package Curso_Java_Secao4;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioS4V29_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("fórmula: DIFERENCA = (A * B - C * D)");
		
		System.out.print("Valor A: ");
		A = sc.nextInt();
		
		System.out.print("Valor B: ");
		B = sc.nextInt();
		
		System.out.print("Valor C: ");
		C = sc.nextInt();
		
		System.out.print("Valor D: ");
		D = sc.nextInt();
		
		diferenca = A * B - C * D;
		
		System.out.println("DIFERENÇA = "+diferenca);
		
		sc.close();

	}

}
