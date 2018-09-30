import java.util.ArrayList;


public class Candidato {

	int numero;
	String nome;
	ArrayList doacoes = new ArrayList();
	
	public Candidato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String toString() {
		return this.nome + ", " + this.numero + ":";
	}
}