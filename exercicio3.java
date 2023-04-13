package VariaveisOperadores;

import java.util.Scanner;

public class exercicio3 {
	
        public static void main(String[] args) {
		
		
		float SalarioBruto,AdicionalNoturno,HorasExtras,descontos,SalarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.println("insira o total do salario:");
		SalarioBruto = leia.nextFloat();
		System.out.println("insira o adicional notorno:");
		AdicionalNoturno = leia.nextFloat();
		System.out.println("insira as horas extras:");
		HorasExtras = leia.nextFloat();
		System.out.println("insira os descontos:");
		descontos = leia.nextFloat();
		
		SalarioLiquido = (SalarioBruto+AdicionalNoturno+(HorasExtras*5)-descontos);
		
		
		System.out.printf("\nSalario Liquido do colaborador: %.2f",SalarioLiquido);
		
	
		
	}


}
