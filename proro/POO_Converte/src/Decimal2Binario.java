import java.util.Scanner;
import java.util.Stack;
public class Decimal2Binario {
	public static void main(String[] args) { //decimal - binario usando pilha
		Scanner entrada = new Scanner(System.in);
		Stack pilha = new Stack();
		System.out.println("digite um valor: ");
		int dec = entrada.nextInt();
		int resto;
		while (dec > 1) {
			resto = dec % 2;
			pilha.push(resto);
			dec = dec / 2;
		}
		pilha.push(dec);
		while(!pilha.empty()) {
			System.out.print(pilha.pop());
		}
	}

}
