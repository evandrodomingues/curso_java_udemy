import java.util.Scanner;

public class Tabuada {
	
    public static void main(String[] args) {

    	int numero, limiteCalculo = 0;
              
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Programa que exibe a tabuada de um numero");
        System.out.println("até o limite definido");
        System.out.println("");
        System.out.print("Informe um número: ");       
        numero = sc.nextInt();
        
        System.out.print("Informe o limite : ");       
        limiteCalculo = sc.nextInt();
        
        System.out.println("");

        System.out.println("RESULTADO");
        System.out.println("");
        
        for (int i = 1; i<=limiteCalculo; i++) { 
        	System.out.println( numero + " x " + i + " = " + (numero*i) );
        }

        System.out.println("");
        System.out.println("Tabuada do "+numero+" de 1 até "+limiteCalculo);
        System.out.println("");
        
        sc.close();
    }
}
