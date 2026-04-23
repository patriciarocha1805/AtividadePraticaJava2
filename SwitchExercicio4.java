package atividadePraticaJava2;

import java.util.Scanner;

public class SwitchExercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int operacao;
		float saldo = 1000;
		float deposito, saque, novoSaldo;
		
		System.out.println("Digite o número da operação: ");
		operacao = leia.nextInt();
		
		switch (operacao) {
		
		case 1:
			System.out.println("O seu saldo é: " + saldo);
			break;
			
		case 2:
			System.out.println("Digite o valor que deseja sacar: ");
			saque = leia.nextFloat();
			novoSaldo = saldo - saque;
			break;
			
		case 3:
			System.out.println("Digite o valor que deseja depositar: ");
			deposito = leia.nextFloat();
			novoSaldo = saldo + deposito;
			break;
			
		default:
		    System.out.println("Operação Inválida!");
		    break;
		}

	}

}
