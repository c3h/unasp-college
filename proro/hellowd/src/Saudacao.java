
public class Saudacao {
	
	private int hora;
	
	public void digaOI() {
		
		if(hora < 18)
			System.out.println("Ola MUNDO! - Bom dia");
		else
			System.out.println("Ola MUNDO! - Boa Noite");
		
	}
	
	public void setHora(int hora) {
		this.hora = hora;
		
	}
}
