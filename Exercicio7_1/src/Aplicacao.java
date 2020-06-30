
public class Aplicacao {

	public static void main(String[] args) {
		AreaCalculavel q = new Quadrado(15);
		q.calcularArea();
		
		
		AreaCalculavel c = new Circunferencia(14);
		c.calcularArea();
		
		
		AreaCalculavel r = new Retangulo(12,12);
		r.calcularArea();
		
	}

}
