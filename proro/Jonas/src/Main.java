import java.util.Scanner;

public class Main {

			public static void main(String[] args) {
				int SIZE = 5;
				Scanner urna = new Scanner(System.in);
				Controle controle = new Controle(SIZE); 
				int novoVoto;
				
				while (controle.getTotal() < SIZE) {
					novoVoto = urna.nextInt();
					if (!controle.existe(novoVoto))
						controle.contabiliza(novoVoto);
				}

				System.out.println("Fim! " + SIZE + " indicacoes");
			}

}
