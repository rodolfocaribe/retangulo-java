package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, altura;
		
		System.out.print("DIGITE A LARGURA DO RETANGULO: ");
		largura = sc.nextDouble();
			while (largura <= 0) {
				System.out.print("O Valor deve ser positivo. Tente novamente: ");
				largura = sc.nextDouble();
			}
	
		sc.close();

		
	}

}
