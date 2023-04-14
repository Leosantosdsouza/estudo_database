package RM94873_Ativ_Cap8;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Fintech> list = new ArrayList<>();
		
		System.out.print(" Entre com o numero de Contas: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println(" Conta #" + i);
			System.out.print("Email: ");
			sc.nextLine();
			String email = sc.nextLine();
			System.out.print(" Numero da Conta: ");
			int NumeroConta = sc.nextInt();
			System.out.print(" Saldo: ");
			double Saldo = sc.nextDouble();
			System.out.print(" Gasto: ");
			double Gasto = sc.nextDouble();

			
			list.add(new Fintech(email, NumeroConta, Saldo, Gasto));

		}
		
		System.out.println();
		System.out.println(" Informações: ");
		for (Fintech emp : list) {
			System.out.println(emp.getEmail() + " - " + String.format(" %.2f ", emp.SaldoAtual()));
		}
		
		sc.close();
	}
}