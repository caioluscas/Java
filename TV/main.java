package material5ex2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eletronico ele = new Eletronico(true);
		//ele.ligar();
		ele.deligar();
		
		Radio rad = new Radio(true, false);
		//rad.ligar();
		rad.Tocar_Musica();
		
		Tablet tab = new Tablet(true, 90);
		tab.Aumentar_Volume();
		tab.Diminuir_Volume();
		tab.Diminuir_Volume();
		
		

	}

}
