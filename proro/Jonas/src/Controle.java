
public class Controle {
	private int [] vetor;
	private int total = 0;
	
	public Controle(int size) {
		vetor = new int[size];
	}
	public int getTotal() {
		return this.total;
	}
	
 	public void contabiliza(int voto) {		

		this.vetor[this.total++] = voto;
	}

 	public boolean existe(int voto) {
 		 		
 		for(int i=0; i<this.total; i++) {
 			if(this.vetor[i] == voto) {
 				return true;
 			}
 		}
 		
 		return false; 		
 	}
 	
}
