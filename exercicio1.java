package VariaveisOperadores;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		
		float salario,abono,novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("insira valor do salario: ");
		salario = leia.nextFloat();
		System.out.println("insira valor do abono: ");
		abono = leia.nextFloat();
		
		
		novosalario = (salario+abono);
		
		System.out.printf("Valor do novo salario: %.2f ",novosalario);
		
		
		

	}

}
