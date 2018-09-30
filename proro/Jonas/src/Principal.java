import java.util.Scanner;

public class Principal {

			public static void main(String[] args) {
				
				Scanner urna = new Scanner(System.in);
				Controle controle = new Controle(); 
				int novoVoto;
				int SIZE = 4;
				controle.incializa(SIZE);
				
				while (controle.getTotal() < SIZE) {
					System.out.print("Voto: ");
					novoVoto = urna.nextInt();
					if (!controle.existe(novoVoto))
						controle.contabiliza(novoVoto);
				}

				System.out.println("Fim! Com " + SIZE + " indicacoes validas ");
				//controle.mostraVotos(); /*@todo*/
			}

}
