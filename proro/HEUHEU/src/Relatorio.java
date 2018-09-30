public abstract class Relatorio {
	
	/**
	 * imprime o fundo total recebido por doacao por um candidato
	 * para doacoes do tipo INDIVIDUAL - 5%
	 * para doacoes do tipo INDIVIDUAL - 10%
	 */
	public static void imprimeFundoPorCandidato(Candidato c){
		
		double total = 0;
		
		for (int i=0; i<c.doacoes.size(); i++) {
			
			Doacao doatemp = (Doacao)c.doacoes.get(i); 
			
			if (doatemp.tipo == 1)
				total = total + doatemp.valor - doatemp.valor*5/100;
			else 
				total = total + doatemp.valor - doatemp.valor*10/100;
			
		}
		System.out.println(total);
	}
	
}