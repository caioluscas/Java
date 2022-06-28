
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] temperaturas = new double[365];
		temperaturas[0] = 16.4;
		temperaturas[1] = 27.1;
		temperaturas[2] = 40.7;
		temperaturas[3] = 34.2;
		temperaturas[4] = 48;
		
		System.out.println("Temperatura dia 1: "+temperaturas[0]);
		System.out.println("Tamanho do array: "+temperaturas.length);
		System.out.println("Endereço: "+temperaturas);
		
		for(int i=0; i<temperaturas.length; i++) {
			System.out.println("Dia "+(i+1)+" temperatura: "+temperaturas[i]);
		}
		
		for(double temperaturas1:temperaturas) {
			System.out.println(temperaturas1);
		}

	}

}
