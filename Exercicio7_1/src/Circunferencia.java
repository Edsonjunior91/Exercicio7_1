
public class Circunferencia implements AreaCalculavel {
	private double raio;

	public Circunferencia (double raio) {
		this.raio = raio;
	}
	@Override
	public void calcularArea() {
		double area = Math.PI * raio * raio;
		System.out.println("Area da Circunferencia é: " + area);
	}
	
	
}
