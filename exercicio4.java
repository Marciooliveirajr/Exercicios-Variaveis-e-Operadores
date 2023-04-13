package VariaveisOperadores;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		
		float n1,n2,n3,n4,diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("insira valor do primeiro produto: ");
		n1 = leia.nextFloat();
		System.out.println("insira o valor do segundo produto: ");
		n2 = leia.nextFloat();
		System.out.println("insira valor do terceiro produto: ");
		n3 = leia.nextFloat();
		System.out.println("insira o valor do quarto produto: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1*n2)-(n3*n4);
		
	    System.out.println("\nA diferença dos produtos é : "+diferenca);
		
		

	}

}
