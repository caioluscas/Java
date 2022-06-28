package material5ex2;

public class Radio extends Eletronico{
	boolean tocando_musica ;
	
	public Radio(boolean ligado, boolean tm) {
		super(ligado);
		// TODO Auto-generated constructor stub
		this.tocando_musica = tm;
	}

	
	protected void Tocar_Musica(){
		if(tocando_musica=true) {
			System.out.println("Radio Tocando musica!");
		}
	}
	
	protected void Parar_Musica() {
		if(tocando_musica=false) {
			System.out.println("Radio Sem musica!");
		}
	}
	
	public boolean isTocando_musica() {
		return tocando_musica;
	}
	

}
