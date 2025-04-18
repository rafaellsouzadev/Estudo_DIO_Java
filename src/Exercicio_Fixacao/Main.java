package Exercicio_Fixacao;

import java.util.Scanner;

public class Main {

	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int option;
		
		AreaGeometrica areaGeometrica = null;

		while (true) {
			System.out.println("Escolha a forma geometrica para calcular a área");
			System.out.println("1 - Quadrado");
			System.out.println("2 - Retângulo");
			System.out.println("3 - Circuloa");
			
			option = scanner.nextInt();

			if (option == 1) {
				areaGeometrica = crearQuadrado();
			} else if (option == 2) {
				areaGeometrica = crearRetangulo();
			} else if (option == 3) {
				areaGeometrica = crearCirculo();
			} else if (option == 4) {
				System.out.println("Fim do programa!");
				break;
			} else {
				System.out.println("Opção Inválida\n");
				continue;
			}
			
			System.out.println("\nO resulto do cálculo da área foi de " + areaGeometrica.getArea() + "\n");

		}

	}

	private static AreaGeometrica crearQuadrado() {
		System.out.println("Informe o tamanho dos lados:");
		var lado = scanner.nextDouble();

		return new Quadrado(lado);
	}

	private static AreaGeometrica crearRetangulo() {
		System.out.println("Informe a base:");
		var base = scanner.nextDouble();

		System.out.println("Informe a altura:");
		var altura = scanner.nextDouble();

		return new Retangulo(base, altura);
	}

	private static AreaGeometrica crearCirculo() {
		System.out.println("Informe o raio:");
		var raio = scanner.nextDouble();

		return new Quadrado(raio);
	}

}
