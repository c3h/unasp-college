
public class Principal {

	public static void main(String[] args) {
		
		Auditoria audit = new Auditoria();
		
		Vendedor vendor1 = new Vendedor("1010");
		Vendedor vendor2 = new Vendedor();
		
		System.out.println("Relatorio mes 1");
		System.out.println("*********");
		System.out.println(vendor1.matricula + "|" + vendor1.total + "[" + vendor1.nivel + "]");
		System.out.println(vendor2.matricula + "|" + vendor2.total + "[" + vendor2.nivel + "]");
		
		//audit.adicionaTotal(vendor1, 3);
		audit.adicionaTotal(vendor1, 101);
		
		System.out.println("Relatorio mes 2");
		System.out.println("*********");
		System.out.println(vendor1.toString());
		System.out.println(vendor2.matricula + "|" + vendor2.total + "[" + vendor2.nivel + "]");
	}

}
