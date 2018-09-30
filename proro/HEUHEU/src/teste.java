
public class teste {

	public static void main(String[] args) {
		
		Candidato candidato1 = new Candidato("marina", 1);
		Candidato candidato2 = new Candidato("bolsomito", 2);
		
		Doacao doacao1 = new Doacao();
		doacao1.valor = 100;
		doacao1.tipo = 1;
		
		Doacao doacao2 = new Doacao();
		doacao2.valor = 1000;
		doacao2.tipo = 2;
		
		Doacao doacao3 = new Doacao();
		doacao3.valor = 2000;
		doacao3.tipo = 1;
		
		candidato1.doacoes.add(doacao1);
		candidato1.doacoes.add(doacao2);
		candidato1.doacoes.add(doacao3);
		
		System.out.println("relatorio\n********");
		
		System.out.println(candidato1);
		Relatorio.imprimeFundoPorCandidato(candidato1);
		
		System.out.println(candidato2);
		Relatorio.imprimeFundoPorCandidato(candidato2);
		
		System.out.println("fim");
	}

}
