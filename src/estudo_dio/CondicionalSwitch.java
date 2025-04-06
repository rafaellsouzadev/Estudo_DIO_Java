package estudo_dio;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		System.out.println("Informe um numero de 1 a 7");

		var option = sc.nextInt();

//		switch(option) {
//		case 1:
//			System.out.println("Sabado");
//			break;
//		case 2:
//			System.out.println("Domingo");
//			break;
//		case 3:
//			System.out.println("Segunda");
//			break;
//		case 4:
//			System.out.println("Terça");
//			break;
//		case 5:
//			System.out.println("Quarta");
//			break;
//		case 6:
//			System.out.println("Quinta");
//			break;
//		case 7:
//			System.out.println("Sexta");
//			break;
//		default:
//			System.out.println("Opção invalida");
//			break;
//		}

//		switch(option) {
//		case 1 -> System.out.println("Domingo");
//		case 2 -> System.out.println("Segunda");
//		case 3 -> System.out.println("Terça");
//		case 4 -> System.out.println("Quarta");
//		case 5 -> System.out.println("Quinta");
//		case 6 -> System.out.println("Sexta");
//		case 7 -> System.out.println("Sabado");
//		default -> System.out.println("Opção invalida");
//		}

		var message = switch (option) {
		case 1 -> "Domingo";
		case 2 -> "Segunda";
		case 3 -> "Terça";
		case 4 -> "Quarta";
		case 5 -> "Quinta";
		case 6 -> "Sexta";
		case 7 -> "Sabado";
		default -> "Opção invalida";
		};

		System.out.println(message);

		sc.close();

	}

}
