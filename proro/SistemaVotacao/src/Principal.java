import java.util.Scanner;
public class Principal{
	private static Scanner urna; 
	public static void main(String[] args) {
		urna = new Scanner(System.in);
		final int SIZE = urna.nextInt();
		int novoVoto;
		//Controle.inicializa(SIZE);
		Controle controle = new Controle(SIZE); 
		while (controle.getTotal() < SIZE) {
			novoVoto = urna.nextInt();
			if (!controle.existe(novoVoto))
				controle.contabiliza(novoVoto);
			}
			System.out.println("Fim! Com " + SIZE + " indicacoes validas 10");
			controle.mostraVotos(); /*@todo*/
	}
}
