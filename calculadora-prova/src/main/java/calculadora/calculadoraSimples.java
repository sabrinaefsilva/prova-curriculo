package calculadora;

import java.util.Scanner;

public class calculadoraSimples {

	private static Scanner input;

	public static void main(String[] args) {
		
		int n1;
		int n2;
		 
		
		input = new Scanner(System.in);
		
		System.out.println("Primeiro numero?");
		n1 = input.nextInt();
		System.out.println("Segundo numero? ");
		n2 = input.nextInt();
		
		
		System.out.println("Soma " + (n1=n2));
		System.out.println("Subtracao " + (n1-n2));
		System.out.println("Multiplicação " + (n1*n2));
		System.out.println("Divisão " + (n1/n2));
	}
}
