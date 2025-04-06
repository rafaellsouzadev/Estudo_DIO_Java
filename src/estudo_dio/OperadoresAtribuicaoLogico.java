package estudo_dio;

import java.util.Scanner;

public class OperadoresAtribuicaoLogico {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		System.out.println("Quanto é 2 + 2?");
		var result = sc.nextInt();
		var isWrong = result != 4;
		System.out.printf("O resultado é 4, você acertou? (%s) \n ", !isWrong);

		sc.close();
	}

}
