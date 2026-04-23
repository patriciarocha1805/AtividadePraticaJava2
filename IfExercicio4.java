package atividadePraticaJava2;

import java.util.Scanner;

public class IfExercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String car1, car2, car3;
		
		System.out.println("Digite a primeira característica: ");
		car1 = leia.nextLine();
		
		System.out.println("Digite a segunda característica: ");
		car2 = leia.nextLine();
		
		System.out.println("Digite a terceira característica: ");
		car3 = leia.nextLine();
		
		if ((car1.equalsIgnoreCase("vertebrado")) && (car2.equalsIgnoreCase("mamífero"))
				&& (car3.equalsIgnoreCase("onívoro"))) {
				System.out.println("Homem");
		}else if ((car1.equalsIgnoreCase("invertebrado")) && (car2.equalsIgnoreCase("inseto"))
				&& (car3.equalsIgnoreCase("herbívoro"))) {
				System.out.println("Lagarta");
		}else
			System.out.println("Opções inválidas!");
		}

	
}
	

