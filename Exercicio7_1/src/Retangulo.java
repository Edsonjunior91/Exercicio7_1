
public class Retangulo implements AreaCalculavel {
	private double altura;
	private double largura;
	private double area;
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	@Override
	public void calcularArea() {
		area = largura * altura;
		if(altura == largura) { 
			System.out.println("Isto � um quadrado de Area: "+ area);
		}else {
			System.out.println("Area do Ret�ngulo �: "+ area);
		}
		
	}
}
