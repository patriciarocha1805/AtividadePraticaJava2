package atividadePraticaJava2;

import java.util.Scanner;

public class SwitchExercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		float operacao, numero1, numero2;
		
		System.out.println("--- CALCULADORA ---");
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite a operação: 1-Soma, 2-Subtração, 3-Multiplicação, 4- Divisão: ");
		opcao = leia.nextInt();
		
		switch (opcao) {
		
		case 1: operacao = numero1 + numero2;
		System.out.println(numero1 + " + " + numero2 + " = " + operacao);
		break;
		
		case 2: operacao = numero1 - numero2;
		System.out.println(numero1 + " - " + numero2 + " = " + operacao);
		break;
			
		case 3: operacao = numero1 * numero2;
		System.out.println(numero1 + " * " + numero2 + " = " + operacao);
		break;
			
		case 4: operacao = numero1 / numero2;
		System.out.println(numero1 + " / " + numero2 + " = " + operacao);
		break;
			
		}
		
	}

}
