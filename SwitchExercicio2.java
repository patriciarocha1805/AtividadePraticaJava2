package atividadePraticaJava2;

import java.util.Scanner;

public class SwitchExercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome; 
		int codigo;
		float salario, novoSalario;
		
		System.out.println("Digite o nome do funcionário: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o código de colaborador do funcionário: ");
		codigo = leia.nextInt();
		
		System.out.println("Digite o salário do funcionário: ");
		salario = leia.nextFloat();
		
		switch (codigo) {
		
		case 1: 
			System.out.println("Nome: " + nome);
			System.out.println("Cargo: Gerente");
			novoSalario = salario + (salario * 0.1f);
			System.out.println("Salário: " + novoSalario);
			break;
			
		case 2: 
			System.out.println("Nome: " + nome);
			System.out.println("Cargo: Vendedor");
			novoSalario = salario + (salario * 0.07f);
			System.out.println("Salário: " + novoSalario);
			break;
			
		case 3: 
			System.out.println("Nome: " + nome);
			System.out.println("Cargo: Supervisor");
			novoSalario = salario + (salario * 0.09f);
			System.out.println("Salário: " + novoSalario);
			break;
			
		case 4: 
			System.out.println("Nome: " + nome);
			System.out.println("Cargo: Motorista");
			novoSalario = salario + (salario * 0.06f);
			System.out.println("Salário: " + novoSalario);
			break;
			
		case 5: 
			System.out.println("Nome: " + nome);
			System.out.println("Cargo: Estoquista");
			novoSalario = salario + (salario * 0.05f);
			System.out.println("Salário: " + novoSalario);
			break;
			
		case 6: 
			System.out.println("Nome: " + nome);
			System.out.println("Cargo: Técnico de TI");
			novoSalario = salario + (salario * 0.08f);
			System.out.println("Salário: " + novoSalario);
			break;
		}
		
		

	}

}
