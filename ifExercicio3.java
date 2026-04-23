package atividadePraticaJava2;

import java.util.Scanner;

public class ifExercicio3 {

	public static void main(String[] args) {
  
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean qtdDoacao;
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		qtdDoacao = leia.nextBoolean();
		
		if(idade < 18 || idade > 69) {
		System.out.println(nome + " não está apto(a) para doar sangue!");
	}else if((idade >= 60 && idade <= 69) && (qtdDoacao == true)) {
		System.out.println(nome + " não está apto(a) para doar sangue!");
	}else if((idade >= 60 && idade <= 69) && (qtdDoacao == false)) {
		System.out.println(nome + " está apto(a) para doar sangue!");
	}
	else
		System.out.println(nome + " está apto(a) para doar sangue!");
	}

}
