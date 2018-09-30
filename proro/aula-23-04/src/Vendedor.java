
public class Vendedor {
	
	String matricula = "1010";
	int nivel = 1;
	int total = 0;
	
	public Vendedor(String s) {
		this.matricula = s;
		
	}
	public Vendedor() {
		this.matricula = "0000";
		
	}
	public String toString(){
		return "[" + matricula + "|" + nivel + "|" + total + "]";
	}

}
