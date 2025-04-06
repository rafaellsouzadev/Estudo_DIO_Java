package estudo_dio;

public class OperadorBitwise {

	public static void main(String[] args) {
		var value1 = 192168010;
		var binary1 = Integer.toBinaryString(value1);

		System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
		var value2 = 19216212;
		var binary2 = Integer.toBinaryString(value2);
		System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value2, binary2);
		System.out.printf("%s | %s = %s\n", value1, value2, value1 | value2);
		System.out.printf("");

	}

}
