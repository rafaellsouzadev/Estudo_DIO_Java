package Exercicio_Fixacao;

public record Circulo(double raio) implements AreaGeometrica {
	
	private static final double pi = 3.14;

	@Override
	public double getArea() {
		
		return pi * (raio * raio);
	}

}
