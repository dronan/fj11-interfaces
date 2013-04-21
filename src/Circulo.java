
public class Circulo implements AreaCalculavel {
	private double raio;
	
	public Circulo(int raio){
		this.raio = raio;
	}
	
	public double calculaArea() {
		return Math.PI * raio * raio;
	}

}
