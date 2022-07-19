import java.util.ArrayList;


public class Numeros_primos {
	static ArrayList<Integer>arrayList;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicio = 3, fim = 999, i, j;
		boolean primo;
		
		arrayList = new ArrayList<>();
		
		for(i=inicio; i<fim; i++) {
			primo = true;
			if(i==1) 
				primo = false;
				
			if(primo) {
				if((i%2==0)&&(i!=2)) {
					primo = false;
				}
			}
			
			if(primo) {
				for(j=2; j<=(i/2);j++) {
					if(i%j == 0) {
						primo = false;
						break;
					}
				}
			}
			
			if(primo) {
				arrayList.add(i);
			}
			
		}
		
		
		
		System.out.println(arrayList.toString());
		System.out.println();
		
		
		

	}

}
