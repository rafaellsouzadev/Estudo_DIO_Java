package Exercicio_Fixacao;

public record Quadrado(double lado) implements AreaGeometrica {

	@Override
	public double getArea() {
		
		return lado * lado;
	}

}
