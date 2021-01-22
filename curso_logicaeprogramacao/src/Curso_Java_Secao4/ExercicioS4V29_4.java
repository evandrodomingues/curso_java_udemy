package Curso_Java_Secao4;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioS4V29_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		// INICIO
		int matricula, horasTrabalhadas;
		double valorHora, salario;
		
		System.out.print("MATRÍCULA        : ");
		matricula = sc.nextInt();
		
		System.out.print("HORAS TRABALHADAS: ");
		horasTrabalhadas = sc.nextInt();
		
		System.out.print("VALOR HORA       : ");
		valorHora = sc.nextDouble();
		
		salario = valorHora*horasTrabalhadas;
		
		System.out.println();
		
		System.out.println("MATRICULA  : "+matricula);
		System.out.printf("SALÁRIO R$ : %.2f",salario);
		
		sc.close();
	}

}
