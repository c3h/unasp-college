import java.util.ArrayList;
public class Controle {
	private ArrayList votos;  //declaro uma vetor sem nenhum tipo ou tamanho
	public Controle(int size) {
		votos = new ArrayList(size);
	}
	public void contabiliza(int voto) {
		votos.add(0, voto); //add adiciona o "valor" que esta entrando no metodo
	}
	public int getTotal() {
		return votos.size(); //size retorna o tamanho do vetor (arraylist)
	}
	public boolean existe(int valor) {
		return votos.contains(valor); // contains retorna booleano 
	}
	public void mostraVotos() {
			System.out.println(votos); //imprime o array-list 
	}
}
