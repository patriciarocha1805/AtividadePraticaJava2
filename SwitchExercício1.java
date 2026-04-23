package atividadePraticaJava2;

import java.util.Scanner;

public class SwitchExercício1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opcao, quantidade;
		float valor1 = 10, valor2 = 15, valor3 = 18, valor4 = 12,
		valor5 = 8, valor6 = 13, valorTotal;
		
		
		System.out.println("***** CARDÁPIO *****");
		System.out.println("1 - Cachorro Quente .....R$10,00");
		System.out.println("2 - X-Salada .....R$15,00");
		System.out.println("3 - X-Bacon .....R$18,00");
		System.out.println("4 - Bauru .....R$12,00");
		System.out.println("5 - Refrigerante .....R$8,00");
		System.out.println("6 - Suco de Laranja .....R$13,00");
		
		System.out.println("Digite o código do produto: ");
		opcao = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch (opcao) {
		
		case 1: valorTotal = quantidade * valor1;
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Valor total: R$ " + valorTotal);
			break;
			
		case 2: valorTotal = quantidade * valor2;
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: R$ " + valorTotal);
			break;
			
		case 3: valorTotal = quantidade * valor3;
			System.out.println("Produto: X-Bacon");
			System.out.println("Valor total: R$ " + valorTotal);
			break;
			
		case 4: valorTotal = quantidade * valor4;
			System.out.println("Produto: Bauru");
			System.out.println("Valor total: R$ " + valorTotal);
			break;
			
		case 5: valorTotal = quantidade * valor5;
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total: R$ " + valorTotal);
			break;
			
		case 6: valorTotal = quantidade * valor6;
			System.out.println("Produto: Suco de Laranja");
			System.out.println("Valor total: R$ " + valorTotal);
			break;
		
		}
		
		}
	}


