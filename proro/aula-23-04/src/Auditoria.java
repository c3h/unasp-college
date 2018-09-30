
public class Auditoria {
	public void adicionaTotal(Vendedor v, int b) {
		v.total = v.total + b;
		if(v.total > 100) {
			v.nivel = 2;
		}
	}

}
