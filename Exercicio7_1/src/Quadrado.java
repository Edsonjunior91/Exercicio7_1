
public class Quadrado implements AreaCalculavel {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public void calcularArea() {
		double area = lado * lado;
		System.out.println("Area do Quadrado é: " + area);
		
	}

}
