
public class Circulo1 extends Forma_Geometrica1{

	
	
	public Circulo1(int raio, double pi, String cor) {
		super(raio, pi, cor);
		// TODO Auto-generated constructor stub
	}

	public double Area() {
		return (this.getPi()*this.getPi())*this.getRaio();
	}
	public void Cor() {
		System.out.println(getCor());
	}
	
	


	

}
