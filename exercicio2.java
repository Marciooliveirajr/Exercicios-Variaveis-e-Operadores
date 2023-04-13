package VariaveisOperadores;

import java.util.Scanner;

public class exercicio2 {
        public static void main(String[] args) {
		
	
		float nota1,nota2,nota3,nota4,media;
		
		Scanner leia = new Scanner(System.in);
		
				
		System.out.println("insira a primeira nota do participante: ");
		nota1 = leia.nextFloat();
		System.out.println("insira a segunda nota do participante: ");
		nota2 = leia.nextFloat();
		System.out.println("insira a terceira nota do participante: ");
		nota3 = leia.nextFloat();
		System.out.println("insira a quarta nota do participante: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		
		System.out.printf("\nMédia Aritmética: %.1f",media);
		
	
		
	}


}
