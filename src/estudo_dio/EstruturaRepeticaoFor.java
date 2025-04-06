package estudo_dio;

import java.util.Scanner;

public class EstruturaRepeticaoFor {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);

//		for(;;) {
//			System.out.println("Digite um nome: ");
//			var nome = sc.next();
//			
//			if (nome.equalsIgnoreCase("exit")) break;
//			
//			System.out.println(nome);
//			
//			
//		}

		for (var i = 1; i < 100; i++) {
			System.out.println(i);

			if (i == 82) {
				System.out.println("Achamos o numero 82");
				break;
			}

		}

		sc.close();

	}

}
