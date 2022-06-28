package material5ex2;

public class Tablet extends Eletronico{
	int volume;
	

	public Tablet(boolean ligado, int volume) {
		super(ligado);
		// TODO Auto-generated constructor stub
		this.volume = volume;
	}

	public void Aumentar_Volume() {
		setVolume(getVolume()+1);
	}

	public void Diminuir_Volume() {
		setVolume(getVolume()-1);
	}
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if((volume>0)&&(volume<=100)) {
			this.volume = volume;
		}
		System.out.println("Volume Tablet: "+getVolume());
	}
	
	
	

}
