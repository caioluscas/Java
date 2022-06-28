package material5ex2;

public class Eletronico {
	protected boolean ligado;
	
	

	
	public Eletronico(boolean ligado) {
		super();
		this.ligado = ligado;
	}

	public void ligar() {
		ligado = true;
		System.out.println("Ligado!");
	}
	
	public void deligar() {
		ligado = false;
		System.out.println("Desligado!");
	}

	public boolean isLigado() {
		return ligado;
	}

	public void Mostra_Eletronico() {
		System.out.println(isLigado());
	}
	

}
