package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantidade de contribuintes:");
		double n = sc.nextDouble();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Contribuinte #" + n + " dados: ");
			System.out.print("pessoa fisica ou juridica (f/j)? ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'f') {
				System.out.print("NOME: ");
				String nome = sc.nextLine();
				System.out.print("RENDA ANUAL: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("GASTOS COM SAUDE: ");
				double gastosComSaude = sc.nextDouble();
			}else {
				System.out.print("NOME: ");
				String nome = sc.nextLine();
				System.out.print("RENDA ANUAL: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("NUMERO DE FUNCIONARIOS: ");
				int numeroDeFuncionarios = sc.nextInt();
			}
		}

	}

}
